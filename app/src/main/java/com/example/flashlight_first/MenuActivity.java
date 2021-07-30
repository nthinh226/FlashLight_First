package com.example.flashlight_first;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends Activity implements View.OnClickListener {
    ImageButton btnLight;
    ImageButton btnNeon;
    ImageButton btnWaring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_menu);
        btnLight = (ImageButton) findViewById(R.id.btnLight);
        btnNeon = (ImageButton) findViewById(R.id.btnNeon);
        btnWaring = (ImageButton) findViewById(R.id.btnWarring);

        btnLight.setOnClickListener(this);
        btnNeon.setOnClickListener(this);
        btnWaring.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLight:
                Intent light = new Intent(this, LightActivity.class);
                startActivity(light);
                break;
            case R.id.btnNeon:
                Intent neonlight = new Intent(this, NeonActivity.class);
                startActivity(neonlight);
                break;
            case R.id.btnWarring:
                Intent warring = new Intent(this, WarringActivity.class);
                startActivity(warring);
                break;
        }

    }
}