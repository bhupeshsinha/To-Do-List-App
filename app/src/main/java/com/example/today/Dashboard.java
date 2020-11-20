package com.example.today;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Dashboard extends AppCompatActivity {

    Button callSignUp;

    ImageView image;
    TextView logoText, sloganText;
    TextInputLayout username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

         callSignUp = findViewById(R.id.signup_screen);
         image = findViewById(R.id.logo_image);
         logoText = findViewById(R.id.logo_name);
         sloganText = findViewById(R.id.slogan_name);
         username = findViewById(R.id.username);
         password = findViewById(R.id.password);






         callSignUp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Dashboard.this, SignUp.class);
                 Pair[] pairs = new Pair[6];
                 pairs[0] = new Pair<View, String>(image, "logo_image");
                 pairs[1] = new Pair<View, String>(logoText,"logo_text");
                 pairs[2] = new Pair<View, String>(sloganText, "logo_desc");
                 pairs[3] = new Pair<View, String>(username, "username_tran");
                 pairs[4] = new Pair<View, String>(password, "password_tran");
                 pairs[5] = new Pair<View, String>(callSignUp, "login_signup_tran");




                 ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Dashboard.this, pairs);
                 startActivity(intent, options.toBundle());

             }
         });
    }
}