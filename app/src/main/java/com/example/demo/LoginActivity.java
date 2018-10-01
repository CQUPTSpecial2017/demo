package com.example.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import java.util.Arrays;

public class LoginActivity extends AppCompatActivity {
   ImageView giftImage;
   ImageView loginButton;
   ImageView playButton;
   CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
    public  void init(){
        callbackManager=CallbackManager.Factory.create();
        playButton=(ImageView)findViewById(R.id.playButton);
        loginButton=(ImageView)findViewById(R.id.loginButton);
        giftImage=(ImageView)findViewById(R.id.giftImage);
         loginButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 LoginManager.getInstance().logInWithReadPermissions(LoginActivity.this, Arrays.asList("public_profile"));
             }
         });
         LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
             @Override
             public void onSuccess(LoginResult loginResult) {
                 Toast.makeText(getApplicationContext(), "facebook登录成功", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onCancel() {
                 Toast.makeText(getApplicationContext(), "facebook登录取消", Toast.LENGTH_SHORT).show();

             }

             @Override
             public void onError(FacebookException error) {
                 Toast.makeText(getApplicationContext(), "facebook登录错误", Toast.LENGTH_SHORT).show();

             }
         });
        Glide.with(this).load(R.drawable.gift2).into(giftImage);


    }}
