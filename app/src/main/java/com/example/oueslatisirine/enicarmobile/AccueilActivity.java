package com.example.oueslatisirine.enicarmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
