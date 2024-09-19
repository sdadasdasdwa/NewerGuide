package com.frank.guide.model;

import android.text.Highlights;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 *  GuidePage类存储者所有需要进行展示的页面
 */
public class GuidePage {

    // 高亮标记部分
    private List<HighlightRectF> rectFList = new ArrayList<>();

    // 等下会使用到的资源文件ID
    private int layoutResId;

    private GuidePage(){

    }

    // 静态内部类
    private static class GuidePageHolder{
        private static final GuidePage INSTANCE = new GuidePage();
    }

    public static GuidePage newInstance(){
        return GuidePageHolder.INSTANCE;
    }

    public GuidePage addHighLight(View view) {
        return addHighLight(view, HighLight.Shape.RECTANGLE, 0, 0, null);
    }

    public GuidePage addHighLight(View view,HighLight.Shape shape,int round,int padding,RelativeGuide relativeGuide){
        HighlightRectF highlightRectF = new HighlightRectF();
        if(relativeGuide != null){
            relativeGuide.setHighlight(highlightRectF);
            highlightRectF.setOption(new HighlightOptions.Builder().setRelativeGuide(relativeGuide).build());
        }
        rectFList.add(highlightRectF);
        return this;
    }

    // 设置引导布局资源文件ID
    public GuidePage setLayoutResId(int layoutResId) {
        this.layoutResId = layoutResId;
        return this;
    }
}
