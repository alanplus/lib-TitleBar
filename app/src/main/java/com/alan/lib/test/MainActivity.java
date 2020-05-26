package com.alan.lib.test;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alan.lib.title.TitleBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TitleBar titleBar = findViewById(R.id.title_bar);
        titleBar.setSubTitle("abc");
        titleBar.setRightText("确定");
        titleBar.setRightTextClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "abc", Toast.LENGTH_LONG).show();
            }
        });
        titleBar.hiddenLeftImageView();
        titleBar.setRightImageView(R.mipmap.icon_live_bottom_img3_black);
        titleBar.setRightImageView(View.NO_ID);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                titleBar.setRightImageView(R.mipmap.icon_live_bottom_img3_black);
            }
        }, 1000);
    }
}
