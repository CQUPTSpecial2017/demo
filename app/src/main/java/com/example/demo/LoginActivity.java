package com.example.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {
   ImageView giftImage;
   ImageView loginButton;
   ImageView playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
    public  void init(){
        playButton=(ImageView)findViewById(R.id.playButton);
        loginButton=(ImageView)findViewById(R.id.loginButton);
        giftImage=(ImageView)findViewById(R.id.giftImage);
        giftImage.bringToFront();
        Glide.with(this).load(R.drawable.gift2).into(giftImage);


    }}
