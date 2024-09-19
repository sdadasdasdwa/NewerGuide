package com.frank.guide.model;

/**
 * HighlightOptions类是一个配置对象，用于设置界面高亮区域引导功能的行为。
 * 比如 点击回调、相对位置的引导布局、高亮位置的回调.
 * 内部类Builder使用了建筑者模式
 */
public class HighlightOptions {

    private RelativeGuide relativeGuide ;

    public static class Builder{

        private HighlightOptions highlightOptions;


        public Builder(){
            highlightOptions = new HighlightOptions();
        }

        public Builder setRelativeGuide(RelativeGuide relativeGuide){
            highlightOptions.relativeGuide = relativeGuide;
            return this;
        }

        public HighlightOptions build(){
            return highlightOptions;
        }




    }




}
