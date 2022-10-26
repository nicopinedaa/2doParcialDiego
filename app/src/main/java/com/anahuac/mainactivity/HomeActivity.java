package com.anahuac.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.anahuac.mainactivity.adapter.HomeHeaderAdapter;

public class HomeActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new HomeHeaderAdapter(getSupportFragmentManager()));
    }
}