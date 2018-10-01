package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 爱学习的呆子熹 on 2018/10/1.
 */

public class ImageDetail {
    private List<Float> xLocations = new ArrayList<>();
    private List<Float> yLocations = new ArrayList<>() ;
    private List<Float> scaleWidths = new ArrayList<>()  ;
    private List<Float> scaleHeights = new ArrayList<>() ;

    public List<Float> getxLocations() {
        return xLocations;
    }

    public void setxLocations(List<Float> xLocations) {
        this.xLocations = xLocations;
    }

    public List<Float> getyLocations() {
        return yLocations;
    }

    public void setyLocations(List<Float> yLocations) {
        this.yLocations = yLocations;
    }

    public List<Float> getScaleWidths() {
        return scaleWidths;
    }

    public void setScaleWidths(List<Float> scaleWidths) {
        this.scaleWidths = scaleWidths;
    }

    public List<Float> getScaleHeights() {
        return scaleHeights;
    }

    public void setScaleHeights(List<Float> scaleHeights) {
        this.scaleHeights = scaleHeights;
    }
}
