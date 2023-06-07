package com.example.practicau4_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void act9(View view){
        Intent intent7 = new Intent(this, MainActivity.class);
        startActivity(intent7);
    }
    public void act10(View view){
        bt7();

    }
    private void bt7() {
        finish();
    }
}