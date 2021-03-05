package com.example.schoolmanagementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, uploadImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.uploadNotice);
        uploadImage = findViewById(R.id.uploadImage);


        uploadNotice.setOnClickListener(this);
        uploadImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {

            case R.id.uploadNotice:
                intent = new Intent(MainActivity.this, Uploadnotice.class);
                startActivity(intent);
                break;

            case R.id.uploadImage:
                intent = new Intent(MainActivity.this, UploadImage.class);
                startActivity(intent);
                break;
        }

    }
}