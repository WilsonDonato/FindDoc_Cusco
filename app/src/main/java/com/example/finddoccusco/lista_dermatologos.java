package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class lista_dermatologos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Dermatologos en el Cusco");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_dermatologos);

    }

    public void yaracely(View view) {
        Intent intent = new Intent(lista_dermatologos.this,dermatologo1.class);
        startActivity(intent);
    }

    public void segundo(View view) {
        Intent intent = new Intent(lista_dermatologos.this,dermatologo2.class);
        startActivity(intent);
    }

    public void tercero(View view) {
        Intent intent = new Intent(lista_dermatologos.this,dermatologo3.class);
        startActivity(intent);
    }
    public void cuarto(View view) {
        Intent intent = new Intent(lista_dermatologos.this,dermatologo4.class);
        startActivity(intent);
    }
    public void quinto(View view) {
        Intent intent = new Intent(lista_dermatologos.this,dermatologo5.class);
        startActivity(intent);
    }


}