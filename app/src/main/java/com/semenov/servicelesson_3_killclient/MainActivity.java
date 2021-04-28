package com.semenov.servicelesson_3_killclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStart(View v) {
        startService(new Intent("com.semenov.servicelesson_3_killserver.MyService").putExtra("name", "value"));
    }
}