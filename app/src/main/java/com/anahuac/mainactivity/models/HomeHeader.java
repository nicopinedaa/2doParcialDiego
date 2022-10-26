package com.anahuac.mainactivity.models;

import com.anahuac.mainactivity.R;

import java.util.ArrayList;
import java.util.List;

public class HomeHeader {
    private int image;
    private String code;

    public void setImage(int image) {
        this.image = image;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getImage() {
        return image;
    }

    public String getCode() {
        return code;
    }
    public static List<HomeHeader> getHomeHeader (){
        List<HomeHeader> items = new ArrayList<>();

        HomeHeader item1 = new HomeHeader();
        item1.setImage(R.drawable.ic_home_anahuac);
        item1.setCode("anahuac");

        HomeHeader item2 = new HomeHeader();
        item2.setImage(R.drawable.ic_home_latente);

        items.add(item1);
        items.add(item2);

        return items;


    }
}
