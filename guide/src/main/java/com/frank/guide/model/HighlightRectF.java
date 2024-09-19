package com.frank.guide.model;

import android.graphics.RectF;
import android.view.View;

import androidx.annotation.Nullable;

/**
 *
 */
public class HighlightRectF implements HighLight{

    private HighlightOptions highlightOptions;

    @Override
    public Shape getShape() {
        return null;
    }

    @Override
    public RectF getRectF(View view) {
        return null;
    }

    @Override
    public float getRadius() {
        return 0;
    }

    @Override
    public int getRound() {
        return 0;
    }

    @Nullable
    @Override
    public HighlightOptions getOptions() {
        return highlightOptions;
    }

    public void setOption(HighlightOptions highlightOptions){
        this.highlightOptions = highlightOptions;
    }

}
