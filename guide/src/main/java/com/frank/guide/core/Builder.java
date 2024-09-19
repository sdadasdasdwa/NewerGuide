package com.frank.guide.core;

import android.app.Activity;
import android.os.Build;

import androidx.fragment.app.Fragment;

import com.frank.guide.model.GuidePage;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder类可以对所以需要进行展示的GuidePage进行同一管理
 */
public class Builder {
    private Activity activity;

    private Fragment fragment;

    private String label;

    private List<GuidePage> guidePageList = new ArrayList<>();


    public Builder(Activity activity) {
        this.activity = activity;
    }


    public Builder(Fragment fragment) {
        this.fragment = fragment;
    }


    public Builder setLabel(String label) {
        this.label = label;
        return this;
    }

    public Builder addGuidePage(GuidePage page){
        guidePageList.add(page);
        return this;
    }





}
