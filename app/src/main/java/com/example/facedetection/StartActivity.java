package com.example.facedetection;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    ImageView camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        camera =findViewById(R.id.camera);


        camera.setOnClickListener(v -> {
            Intent MainIntent = new Intent(com.example.facedetection.StartActivity.this, MainActivity.class);
            startActivity(MainIntent);

        });
    }
}