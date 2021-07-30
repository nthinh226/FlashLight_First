package com.example.flashlight_first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class TrafficActivity extends AppCompatActivity {
    ImageView imgTraffic;
    Handler handler;
    Timer timer;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        imgTraffic = (ImageView) findViewById(R.id.imgTraffic);

        handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if(msg.what == 0){
                    if(i < 2){
                        i++;
                        imgTraffic.setImageLevel(i);
                    }else{
                        i=0;
                        imgTraffic.setImageLevel(i);
                    }
                }
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