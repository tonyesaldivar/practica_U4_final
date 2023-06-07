package com.example.practicau4_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Método para usar el botón siguiente para cambiar de Activity
    public void act2(View view){
        Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent1);
        finish();
    }
}