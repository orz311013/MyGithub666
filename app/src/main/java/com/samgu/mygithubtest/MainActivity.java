package com.samgu.mygithubtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn(View v) {
        Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT).show();
    }

    public void btn1(View v) {
        Intent it = new Intent(this, Main2Activity.class);
        startActivity(it);

    }

}
