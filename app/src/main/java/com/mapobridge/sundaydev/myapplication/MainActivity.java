package com.mapobridge.sundaydev.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private RecyclerView recyclerView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = (RecyclerView) findViewById(R.id.rcvList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList<String> stringArrayList = new ArrayList<String>();

        for (int i = 0; i < 64; i++) {
            stringArrayList.add(String.valueOf(i));
        }

        MainAdapter mainAdapter = new MainAdapter(this, stringArrayList);
        recyclerView.setAdapter(mainAdapter);
    }
}
