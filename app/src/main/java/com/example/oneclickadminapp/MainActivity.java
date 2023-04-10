package com.example.oneclickadminapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.oneclickadminapp.faculty.UpdateFaculty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, addGalleryImage, addEbook, faculty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice= findViewById(R.id.addNotice);
        addGalleryImage= findViewById(R.id.addGalleryImage);
        addEbook = findViewById(R.id.addEbook);
        faculty = findViewById(R.id.faculty);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){

            case R.id.addNotice:
                intent = new Intent(MainActivity.this,UploadNotice.class);
                startActivity(intent);
                break;
            case R.id.addImage:
                intent = new Intent(MainActivity.this,UploadImage.class);
                startActivity(intent);
                break;
            case R.id.addEbook:
                intent = new Intent(MainActivity.this,UploadPdfActivity.class);
                startActivity(intent);
                break;
            case R.id.faculty:
                intent = new Intent(MainActivity.this, UpdateFaculty.class);
                startActivity(intent);
                break;
        }
    }
}