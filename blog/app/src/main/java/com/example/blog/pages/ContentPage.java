package com.example.blog.pages;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.blog.utils.Content_Adapter;
import com.example.blog.R;
import com.example.blog.models.ContentModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class ContentPage extends AppCompatActivity {
    FirebaseAuth mauth;
    FirebaseUser user ;

    ArrayList<ContentModel>contentModels;
    Content_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_content_page);
        mauth = FirebaseAuth.getInstance();
        user = mauth.getCurrentUser();
        if(user != null) {
            Log.d("myTag", "user is logged in");

        }else {
            Log.d("myTag", "user is not logged");
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        contentModels = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Content_Adapter(this, contentModels);
        recyclerView.setAdapter(adapter);





    }
}