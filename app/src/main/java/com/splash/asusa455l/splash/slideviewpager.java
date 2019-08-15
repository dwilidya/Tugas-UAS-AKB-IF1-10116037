package com.splash.asusa455l.splash;
//12/08/2019
//10116037
//dwi lidya utami
//if-1

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class slideviewpager extends AppCompatActivity {
private ViewPager viewPager;
private SlideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slideviewpager);
        viewPager =(ViewPager) findViewById(R.id.viewpager);
        myadapter =new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }
}
