package com.example.flashlight_first;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends Activity implements View.OnClickListener {
    ImageButton btnLight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_menu);
        btnLight = (ImageButton) findViewById(R.id.btnLight);

        btnLight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent light = new Intent(this, LightActivity.class);
        startActivity(light);
    }
}