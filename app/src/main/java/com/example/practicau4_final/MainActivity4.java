package com.example.practicau4_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    RadioButton rb_4, rb_5, rb_6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        rb_4 = (RadioButton) findViewById(R.id.rb4);
        rb_5 = (RadioButton) findViewById(R.id.rb5);
        rb_6 = (RadioButton) findViewById(R.id.rb6);
    }


    //Método para usar el botón siguiente para cambiar de Activity
    public void act4(View view){
        bt3();
    }

    private void bt3() {
        if (rb_4.isChecked()==true){
            Toast.makeText(this, "Respuesta CORRECTA", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity5.class);
            startActivity(intent3);
            finish();
        } else if (rb_5.isChecked()==true) {
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity5.class);
            startActivity(intent3);
            finish();
        }else if (rb_6.isChecked()==true) {
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity5.class);
            startActivity(intent3);
            finish();
        }else if (rb_4.isChecked()!=true || rb_5.isChecked()!=true || rb_6.isChecked()!=true) {
            Toast.makeText(this, "Debe seleccionar una respuesta", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(this, MainActivity4.class);
            startActivity(intent2);
        }
    }
}