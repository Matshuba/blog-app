package com.example.blog.pages;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.blog.R;
import com.google.android.material.textfield.TextInputLayout;

public class LoginPage extends AppCompatActivity {
    Button signUpBtn, loginBtn;
    TextView logo, motto;
    ImageView loginimage;
    TextInputLayout email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        signUpBtn = findViewById(R.id.login_signUp);
        email= findViewById(R.id.loginEmail);
        password = findViewById(R.id.loginPassword);
        loginimage = findViewById(R.id.loginImage);
        logo = findViewById(R.id.loginWelcome);
        motto = findViewById(R.id.loginDescText);
        loginBtn = findViewById(R.id.login_btn);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPage.this, SignUpPage.class);
                Pair[] pairs = new Pair[7];

                pairs[0] = new Pair<View,String>(loginimage,"splashScreenImaageAnim");
                pairs[1] = new Pair<View,String>(email,"loginEmail_trans");
                pairs[2] = new Pair<View,String>(password,"loginPassword_trans");
                pairs[3] = new Pair<View,String>(loginBtn,"login_buttonTrans");
                pairs[4] = new Pair<View,String>(motto,"login_descText");
                pairs[5] = new Pair<View,String>(signUpBtn,"loginSignUp_trans");
                pairs[6] = new Pair<View,String>(logo,"logoText_Animation");
                ActivityOptions opt = ActivityOptions.makeSceneTransitionAnimation(LoginPage.this,pairs);
                startActivity(intent,opt.toBundle());
            }
        });
    }
}