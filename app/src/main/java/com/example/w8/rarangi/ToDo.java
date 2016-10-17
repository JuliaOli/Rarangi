package com.example.w8.rarangi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import saveme.Save;

public class ToDo extends AppCompatActivity implements Save {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

    }

    @Override
    public void saveAll() {

    }
}
