package com.cg.newerguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.newerguide.R;
import com.example.newerguide.databinding.ActivityMainBinding;
import com.frank.guide.NewerGuide;
import com.frank.guide.model.GuidePage;

public class MainActivity extends Activity implements View

        .OnClickListener{

    private ActivityMainBinding binding;

    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 初始化 ViewBinding
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // 设置内容视图为绑定的根视图
        setContentView(binding.getRoot());

        initView();
        initData();
        initEvent();


    }

    private void initView(){
        bt1 = binding.btnSimple;
        bt2 = binding.btnDialog;
        bt3 = binding.btnDialog;
        bt4 = binding.btnAnchor;
        bt5 = binding.btnListener;
        bt6 = binding.btnRect;
        bt7 = binding.btnMulti;
        bt8 = binding.btnList;
        bt9 = binding.btnScroll;
    }


    private void initData(){
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
    }

    private void initEvent(){

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.btn_simple){
            NewerGuide.with(this)
                    .setLabel("guide1")
                    .addGuidePage(GuidePage.newInstance()
                            .addHighLight(bt1)
                            .setLayoutResId(R.layout.view_guide_simple));
        }
    }
}