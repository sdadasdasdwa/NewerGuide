package com.frank.guide;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.fragment.app.Fragment;

import com.frank.guide.core.Builder;
import com.frank.guide.model.GuidePage;

public class NewerGuide {

    public static final String TAG = "NewerGuide";

    /**
     * 成功显示标示
     */
    public static final int SUCCESS = 1;

    /**
     * 显示失败标示，即已经显示过一次
     */
    public static final int FAILED = -1;

    /**
     * 新手指引入口
     *
     * @param activity activity
     * @return builder对象，设置参数
     */
    public static Builder with(Activity activity) {
        return new Builder(activity);
    }

    public static Builder with(Fragment fragment) {
        return new Builder(fragment);
    }


    public static void resetLabel(Context context, String label) {
        SharedPreferences sp = context.getSharedPreferences(NewerGuide.TAG, Activity.MODE_PRIVATE);
        sp.edit().putInt(label, 0).apply();
    }



}
