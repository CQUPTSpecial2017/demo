package com.example.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ToyMachineActivity extends AppCompatActivity {

 ImageView continueb;
 ImageView backer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy_machine);
        init();
    }
    public void  init(){

       backer=(ImageView)findViewById(R.id.backer);
       Glide.with(this).load(R.drawable.backer).into(backer);
        continueb=(ImageView)findViewById(R.id.continueBlue);
        Glide.with(this).load(R.drawable.continuebl).into(continueb);
     continueb.bringToFront();

    }
}
