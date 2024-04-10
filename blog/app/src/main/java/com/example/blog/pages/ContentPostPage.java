package com.example.blog.pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.blog.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ContentPostPage extends AppCompatActivity {

    FirebaseDatabase rootNode;
    DatabaseReference ref;
    TextInputLayout post;
    ImageView uploadImage;
    ProgressBar contentUploadProgressBar;
    Button postBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_post_page);
        rootNode = FirebaseDatabase.getInstance();
        ref = rootNode.getReference("Posts");

        post = findViewById(R.id.contentPost_id);
        uploadImage = findViewById(R.id.contentImageUpload);
        postBtn = findViewById(R.id.contentPostButton);
        contentUploadProgressBar = findViewById(R.id.contentProgressBar);


        postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }


    public boolean isPostValid() {
        String str = post.getEditText().getText().toString();

        if(str.isEmpty()) {
            post.setError("Field cant be empty");
            return false;

        }else {
            post.setError(null);
            post.setEnabled(false);
            return true;
        }
    }


    public void post() {
        if(!isPostValid()) {
            return;
        }


    }
}