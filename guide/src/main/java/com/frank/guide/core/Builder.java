package com.frank.guide.core;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;

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

    /**
     * 构建引导层controller并直接显示引导层
     *
     * @return controller
     */
    public Controller show() {
        check();
        Controller controller = new Controller(this);
        controller.show();
        return controller;
    }

    private void check() {
        if(TextUtils.isEmpty(label)){
         throw new IllegalArgumentException("label不能为空");
        }
        // 活动为null，抛出异常
        if (activity == null && (fragment != null )) {
            throw new IllegalStateException("activity is null, please make sure that fragment is showing when call NewbieGuide");
        }
    }


}
