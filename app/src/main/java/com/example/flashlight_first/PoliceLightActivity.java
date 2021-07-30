package com.example.flashlight_first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ToggleButton;

import java.util.Timer;
import java.util.TimerTask;

public class PoliceLightActivity extends AppCompatActivity {
    ToggleButton tgPolice;
    Handler handler;
    Timer timer;
    Boolean checkPolice = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_light);

        tgPolice = (ToggleButton) findViewById(R.id.tgPolice);
        tgPolice.setChecked(true);

        handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
                if(!checkPolice){
                    checkPolice = true;
                }else{
                    checkPolice = false;
                }
                tgPolice.setChecked(checkPolice);
            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
            }
        },200,200);
    }
}