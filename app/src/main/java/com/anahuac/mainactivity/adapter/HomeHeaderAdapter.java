package com.anahuac.mainactivity.adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.anahuac.mainactivity.fragments.HomeHeaderFragment;
import com.anahuac.mainactivity.models.HomeHeader;

import java.util.List;

public class HomeHeaderAdapter extends FragmentPagerAdapter {
    private List<HomeHeader> items = HomeHeader.getHomeHeader();
    public HomeHeaderAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        HomeHeaderFragment fragment = new HomeHeaderFragment();
        Bundle args = new Bundle();
        args.putInt("drawable" , items.get(position).getImage());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {return items.size();}
}

