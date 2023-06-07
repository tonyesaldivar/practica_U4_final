package com.example.practicau4_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    RadioButton rb_7, rb_8, rb_9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        rb_7 = (RadioButton) findViewById(R.id.rb7);
        rb_8 = (RadioButton) findViewById(R.id.rb8);
        rb_9 = (RadioButton) findViewById(R.id.rb9);
    }
    //Método para usar el botón siguiente para cambiar de Activity
    public void act5(View view){
        bt4();
    }
    private void bt4() {
        if (rb_7.isChecked()==true){
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(this, MainActivity6.class);
            startActivity(intent4);
            finish();
        } else if (rb_8.isChecked()==true) {
            Toast.makeText(this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(this, MainActivity6.class);
            startActivity(intent4);
            finish();
        }else if (rb_9.isChecked()==true) {
            Toast.makeText(this, "Respuesta CORRECTA", Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(this, MainActivity6.class);
            startActivity(intent4);
            finish();
        }else if (rb_7.isChecked()!=true || rb_8.isChecked()!=true || rb_9.isChecked()!=true) {
            Toast.makeText(this, "Debe seleccionar una respuesta", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity5.class);
            startActivity(intent3);
        }
    }
}