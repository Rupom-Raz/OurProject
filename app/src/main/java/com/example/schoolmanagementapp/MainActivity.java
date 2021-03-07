package com.example.schoolmanagementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schoolmanagementapp.faculty.UpdateFaculty;
import com.example.schoolmanagementapp.notice.DeleteNoticeActivity;
import com.example.schoolmanagementapp.notice.Uploadnotice;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, uploadImage,uploadEbook,updateFaculty,deleteNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.uploadNotice);
        uploadImage = findViewById(R.id.uploadImage);
        uploadEbook = findViewById(R.id.uploadEbook);
        deleteNotice = findViewById(R.id.deleteNotice);
        updateFaculty = findViewById(R.id.updateFaculty);


        uploadNotice.setOnClickListener(this);
        uploadImage.setOnClickListener(this);
        uploadEbook.setOnClickListener(this);
        updateFaculty.setOnClickListener(this);
        deleteNotice.setOnClickListener(this);
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
            case R.id.uploadEbook:
                intent = new Intent(MainActivity.this, UploadPdf.class);
                startActivity(intent);
                break;
            case R.id.updateFaculty:
                intent = new Intent(MainActivity.this, UpdateFaculty.class);
                startActivity(intent);
                break;
            case R.id.deleteNotice:
                intent = new Intent(MainActivity.this, DeleteNoticeActivity.class);
                startActivity(intent);
                break;
        }

    }
}