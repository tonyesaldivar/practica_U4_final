package com.example.practicau4_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RadioButton rb_1, rb_2, rb_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rb_1 = (RadioButton) findViewById(R.id.rb1);
        rb_2 = (RadioButton) findViewById(R.id.rb2);
        rb_3 = (RadioButton) findViewById(R.id.rb3);
    }
    //Método para usar el botón siguiente para cambiar de Activity
    public void act3(View view){
     bt2();
    }

    private void bt2() {
        if (rb_1.isChecked()==true){
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(this, MainActivity4.class);
            startActivity(intent2);
            finish();
        } else if (rb_2.isChecked()==true) {
            Toast.makeText(this, "Respuesta CORRECTA", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(this, MainActivity4.class);
            startActivity(intent2);
            finish();
        }else if (rb_3.isChecked()==true) {
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(this, MainActivity4.class);
            startActivity(intent2);
            finish();
        }else if (rb_1.isChecked()!=true || rb_2.isChecked()!=true || rb_3.isChecked()!=true) {
            Toast.makeText(this, "Debe seleccionar una respuesta", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(this, MainActivity2.class);
            startActivity(intent1);
        }
    }

}