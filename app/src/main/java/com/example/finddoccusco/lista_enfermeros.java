package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class lista_enfermeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Enfermeros en el Cusco");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_enfermeros);

    }


    public void primero(View view) {
        Intent intent = new Intent(lista_enfermeros.this,enfermero1.class);
        startActivity(intent);
    }

    public void segundo(View view) {
        Intent intent = new Intent(lista_enfermeros.this,enfermero2.class);
        startActivity(intent);
    }

    public void tercero(View view) {
        Intent intent = new Intent(lista_enfermeros.this,enfermero3.class);
        startActivity(intent);
    }
    public void cuarto(View view) {
        Intent intent = new Intent(lista_enfermeros.this,enfermero4.class);
        startActivity(intent);
    }
    public void quinto(View view) {
        Intent intent = new Intent(lista_enfermeros.this,enfermero5.class);
        startActivity(intent);
    }


}