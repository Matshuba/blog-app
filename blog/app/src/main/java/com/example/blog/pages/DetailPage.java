package com.example.blog.pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.blog.R;

public class DetailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);


        String Title = getIntent().getStringExtra("Title");
        String content = getIntent().getStringExtra("Content");
        int image = getIntent().getIntExtra("Image", 0);

        TextView titleTextView = findViewById(R.id.titleView);
        ImageView imageView = findViewById(R.id.imageView3);
        CardView includedCardView = findViewById(R.id.includedCardView);


    }
}