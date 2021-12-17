package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class informacion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

    }

    public void primero(View view) {
        Intent intent = new Intent(informacion.this,lista_medicos_generales.class);
        startActivity(intent);
    }

    public void segundo(View view) {
        Intent intent = new Intent(informacion.this,lista_enfermeros.class);
        startActivity(intent);
    }
    public void tercero(View view) {
        Intent intent = new Intent(informacion.this,lista_cardiologos.class);
        startActivity(intent);
    }
    public void cuarto(View view) {
        Intent intent = new Intent(informacion.this,lista_dermatologos.class);
        startActivity(intent);
    }
    public void quinto(View view) {
        Intent intent = new Intent(informacion.this,lista_endroinologos.class);
        startActivity(intent);
    }
}