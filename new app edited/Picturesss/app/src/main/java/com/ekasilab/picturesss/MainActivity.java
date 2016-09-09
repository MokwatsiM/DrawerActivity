package com.ekasilab.picturesss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void nextPicture(View view) {
        Intent objInten = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(objInten);
    }
}
