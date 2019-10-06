package com.example.a40days_sky;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private ViewPager myViewPager;
    private List<Fragment> list;
    private TabFragmentPagerAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager = (ViewPager) findViewById(R.id.ViewPager);
        list =new ArrayList<Fragment>();
        list.add(new sticker_1());
        list.add(new sticker_2());

        adapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), list);
        myViewPager.setAdapter(adapter);
        myViewPager.setCurrentItem(0);








        /*
        TabHost tabHost = (TabHost)findViewById(R.id.tabhost);
        TabHost.TabSpec spec=tabHost.newTabSpec("tab1");
        spec.setIndicator("1~20");
        Intent it1 = new Intent(MainActivity.this,sticker2.class);
        spec.setContent(it1);
        tabHost.addTab(spec);

        spec=tabHost.newTabSpec("tab2");
        spec.setIndicator("21~40");
        spec.setContent(R.id.tab2);
        tabHost.addTab(spec);
        tabHost.setCurrentTab(0);*/


    }
}
