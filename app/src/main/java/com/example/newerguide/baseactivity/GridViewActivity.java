package com.example.newerguide.baseactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newerguide.R;

public class GridViewActivity extends AppCompatActivity {

    private String[] from = {"image", "title"};
    private int[] to = {R.id.image, R.id.title};

    public static void start(Context context) {
        Intent starter = new Intent(context, GridViewActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);


    }
}