package com.example.demo;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;


public class WinActivity extends AppCompatActivity {
ImageView continButton;

ImageView numberImage;
ImageView explode;


ImageView candyRain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        init();
    }
    public void init(){
        candyRain=(ImageView)findViewById(R.id.candyRain);
        explode=(ImageView)findViewById(R.id.explode) ;
        numberImage=(ImageView)findViewById(R.id.numberImage);
        continButton=(ImageView)findViewById(R.id.continButton);
        Glide.with(this).load(R.drawable.continueb).into(continButton);

explode.bringToFront();
        Glide.with(this).load(R.drawable.explode).listener(new RequestListener<Drawable>() {
            @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                GifDrawable gifDrawable=(GifDrawable)resource;
               // gifDrawable.setLoopCount(1);
                return false;
            }
        }).into(explode);

        numberImage.bringToFront();

    }}
