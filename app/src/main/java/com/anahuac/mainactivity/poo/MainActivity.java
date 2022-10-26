package com.anahuac.mainactivity.poo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anahuac.mainactivity.HomeActivity;
import com.anahuac.mainactivity.R;

public class MainActivity extends AppCompatActivity {

    Button btnWidget;
    Button btnAdvancedWidgets;
    Button btnDrawer;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnWidget = findViewById(R.id.btn_elements);
        btnAdvancedWidgets = findViewById(R.id.btn_AdvancedWidget);
        btnDrawer = findViewById(R.id.btn_drawer);
        btnHome = findViewById(R.id.btn_home);

        btnWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WidgetActivity.class);
                startActivity(intent);
            }
        });

        btnAdvancedWidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdvancedWidgetActivity.class);
                startActivity(intent);
            }
        });

        btnDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DrawerActivity.class);
                startActivity(intent);
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}

