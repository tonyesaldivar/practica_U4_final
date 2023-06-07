package com.example.practicau4_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    RadioButton rb_13, rb_14, rb_15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        rb_13 = (RadioButton) findViewById(R.id.rb13);
        rb_14 = (RadioButton) findViewById(R.id.rb14);
        rb_15 = (RadioButton) findViewById(R.id.rb15);
    }
    public void act8(View view){
        bt6();
    }
    private void bt6() {
        if (rb_13.isChecked()==true){
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(this, MainActivity8.class);
            startActivity(intent6);
            finish();
        } else if (rb_14.isChecked()==true) {
            Toast.makeText(this, "Respuesta CORRECTA", Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(this, MainActivity8.class);
            startActivity(intent6);
            finish();
        }else if (rb_15.isChecked()==true) {
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent6 = new Intent(this, MainActivity8.class);
            startActivity(intent6);
            finish();
        }else if (rb_13.isChecked()!=true || rb_14.isChecked()!=true || rb_15.isChecked()!=true) {
            Toast.makeText(this, "Debe seleccionar una respuesta", Toast.LENGTH_SHORT).show();
            finish();
            Intent intent5 = new Intent(this, MainActivity7.class);
            startActivity(intent5);
        }
    }
}