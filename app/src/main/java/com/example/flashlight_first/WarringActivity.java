package com.example.flashlight_first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ToggleButton;

import java.util.Timer;
import java.util.TimerTask;

public class WarringActivity extends AppCompatActivity {
    ToggleButton tgWarring;
    Handler handler;
    Timer timer;
    Boolean checkWarring = false;
    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warring);

        tgWarring = (ToggleButton) findViewById(R.id.tgWarring);
        tgWarring.setChecked(true);

        handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if(!checkWarring){
                    checkWarring = true;
                }else{
                    checkWarring = false;
                }
                tgWarring.setChecked(checkWarring);
            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        },1000,1000);
    }
}