package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class lista_medicos_generales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Medicos Generales en el Cusco");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_medicos_generales);

    }

    public void yaracely(View view) {
        Intent intent = new Intent(lista_medicos_generales.this,yaracely.class);
        startActivity(intent);
    }

    public void segundo(View view) {
        Intent intent = new Intent(lista_medicos_generales.this,SegundoMedicogeneral.class);
        startActivity(intent);
    }

    public void tercero(View view) {
        Intent intent = new Intent(lista_medicos_generales.this,TercerMedicogeneral.class);
        startActivity(intent);
    }
    public void cuarto(View view) {
        Intent intent = new Intent(lista_medicos_generales.this,CuartoMedicogeneral.class);
        startActivity(intent);
    }
    public void quinto(View view) {
        Intent intent = new Intent(lista_medicos_generales.this,QuintoMedicogeneral.class);
        startActivity(intent);
    }


}