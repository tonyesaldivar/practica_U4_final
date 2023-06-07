package com.example.practicau4_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    RadioButton rb_10, rb_11, rb_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        rb_10 = (RadioButton) findViewById(R.id.rb10);
        rb_11 = (RadioButton) findViewById(R.id.rb11);
        rb_12 = (RadioButton) findViewById(R.id.rb12);
    }
    public void act7(View view){
        bt5();
    }
    private void bt5() {
        if (rb_10.isChecked()==true){
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(this, MainActivity7.class);
            startActivity(intent5);
            finish();
        } else if (rb_11.isChecked()==true) {
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(this, MainActivity7.class);
            startActivity(intent5);
            finish();
        }else if (rb_12.isChecked()==true) {
            Toast.makeText(this, "Respuesta CORRECTA", Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(this, MainActivity7.class);
            startActivity(intent5);
            finish();
        }else if (rb_10.isChecked()!=true || rb_11.isChecked()!=true || rb_12.isChecked()!=true) {
            Toast.makeText(this, "Debe seleccionar una respuesta", Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(this, MainActivity6.class);
            startActivity(intent4);
        }
    }
}