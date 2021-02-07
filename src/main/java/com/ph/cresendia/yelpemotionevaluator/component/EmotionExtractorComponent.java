package com.ph.cresendia.yelpemotionevaluator.component;

import com.google.cloud.vision.v1.*;
import com.google.protobuf.ByteString;
import com.ph.cresendia.yelpemotionevaluator.pojo.BizDetailsPageProps;
import com.ph.cresendia.yelpemotionevaluator.pojo.EmotionAnalyzerResult;
import com.ph.cresendia.yelpemotionevaluator.pojo.Review;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class EmotionExtractorComponent {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(EmotionExtractorComponent.class);

    public List<EmotionAnalyzerResult> extractEmotionDetails(BizDetailsPageProps bizDetailsPageProps) {

        if (bizDetailsPageProps == null) {
            return null;
        }
        List<EmotionAnalyzerResult> emotionAnalyzerResultList = new ArrayList<>();
        List<AnnotateImageRequest> requests = new ArrayList<>();

        LOG.info("Review count: " + bizDetailsPageProps.getReviewFeedQueryProps().getReviews().size());
        for (Review reviewHighlights : bizDetailsPageProps.getReviewFeedQueryProps().getReviews()) {
            ByteString imgBytes = null;
            try {
                URL url = new URL(reviewHighlights.getUser().getSrc());
                imgBytes = ByteString.readFrom(url.openStream());
            } catch (IOException e) {
                LOG.error(e.getMessage());
            }

            Image img = Image.newBuilder().setContent(imgBytes).build();
            Feature feat = Feature.newBuilder().setType(Feature.Type.FACE_DETECTION).build();
            AnnotateImageRequest request = AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();

            requests.add(request);

        }

        try (
                ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
            BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
            List<AnnotateImageResponse> responses = response.getResponsesList();

            for (AnnotateImageResponse res : responses) {
                if (res.hasError()) {
                    return null;
                }

                for (FaceAnnotation annotation : res.getFaceAnnotationsList()) {
                    EmotionAnalyzerResult emotionAnalyzerResult = new EmotionAnalyzerResult();
                    emotionAnalyzerResult.setAnger(annotation.getAngerLikelihood());
                    emotionAnalyzerResult.setJoy(annotation.getJoyLikelihood());
                    emotionAnalyzerResult.setSorrow(annotation.getSorrowLikelihood());
                    emotionAnalyzerResult.setSurprised(annotation.getSurpriseLikelihood());

                    emotionAnalyzerResultList.add(emotionAnalyzerResult);
                }
            }
        } catch (Exception e) {
            LOG.error(e.getMessage());
        }

        return emotionAnalyzerResultList;
    }

}
