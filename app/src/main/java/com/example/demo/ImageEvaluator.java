package com.example.demo;

import android.animation.TypeEvaluator;

import java.util.ArrayList;
import java.util.List;

public class ImageEvaluator implements TypeEvaluator {
    ImageDetail currentPoint = new ImageDetail();

    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        ImageDetail startPoint = (ImageDetail) startValue;
        ImageDetail endPoint = (ImageDetail) endValue;
        List<Float> xLocations = new ArrayList<>();
        List<Float> yLocations = new ArrayList<>() ;
        List<Float> scaleWidths = new ArrayList<>()  ;
        List<Float> scaleHeights = new ArrayList<>() ;
        for (int i = 0; i <startPoint.getxLocations().size() ; i++) {
            float x = (endPoint.getxLocations().get(i)-startPoint.getxLocations().get(i))*fraction+startPoint.getxLocations().get(i);
            float y = (endPoint.getyLocations().get(i)-startPoint.getyLocations().get(i))*fraction+startPoint.getyLocations().get(i);
            float scaleHeight = (endPoint.getScaleHeights().get(i)-startPoint.getScaleHeights().get(i))*fraction + startPoint.getScaleHeights().get(i);
            float scaleWidth = (endPoint.getScaleWidths().get(i)-startPoint.getScaleWidths().get(i))*fraction+startPoint.getScaleWidths().get(i);

            xLocations.add(x);
            yLocations.add(y);
            scaleHeights.add(scaleHeight);
            scaleWidths.add(scaleWidth);

        }
//        float x = startPoint.getX() + fraction * (endPoint.getX() - startPoint.getX());
//        float y = startPoint.getY() + fraction * (endPoint.getY() - startPoint.getY());


        currentPoint.setxLocations(xLocations);
        currentPoint.setyLocations(yLocations);
        currentPoint.setScaleHeights(scaleHeights);
        currentPoint.setScaleWidths(scaleWidths);

        return currentPoint;
    }
}
