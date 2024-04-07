package com.example.blog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Pair;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class SignUpPage extends AppCompatActivity {
    Button haveAcc,signUpBtn;
    TextView logo, motto;
    TextInputLayout email,password;
    ImageView signUpImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        haveAcc = findViewById(R.id.alreadHaveAcc);
        email = findViewById(R.id.signUp_email);
        password = findViewById(R.id.signUp_password);
        logo = findViewById(R.id.signUp_logo);
        motto = findViewById(R.id.signUp_motto);
        signUpImage = findViewById(R.id.signUp_image);
        signUpBtn = findViewById(R.id.singUp_button);

        haveAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpPage.this,LoginPage.class);
                Pair[] pairs = new Pair[7];

                pairs[0] = new Pair<View,String>(signUpImage,"splashScreenImaageAnim");
                pairs[1] = new Pair<View,String>(email,"loginEmail_trans");
                pairs[2] = new Pair<View,String>(password,"loginPassword_trans");
                pairs[3] = new Pair<View,String>(signUpBtn,"login_buttonTrans");
                pairs[4] = new Pair<View,String>(motto,"login_descText");
                pairs[5] = new Pair<View,String>(haveAcc,"loginSignUp_trans");
                pairs[6] = new Pair<View,String>(logo,"logoText_Animation");
                ActivityOptions opt = ActivityOptions.makeSceneTransitionAnimation(SignUpPage.this,pairs);
                startActivity(intent,opt.toBundle());
            }
        });
    }
}