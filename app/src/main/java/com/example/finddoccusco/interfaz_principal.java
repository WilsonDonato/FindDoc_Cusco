package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class interfaz_principal extends AppCompatActivity {
    private Button salirb;
    private ImageButton saliri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /////////////////////////////////
        this.setTitle("FindDoc Cusco ");
        /////////////////////////////////
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_principal);

        salirb = findViewById(R.id.btnsalir);
        saliri = findViewById(R.id.imgsalir);

        salirb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        saliri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }

    public void maps(View view) {
        Intent intent = new Intent(interfaz_principal.this,especialistas_cercanos.class);
        startActivity(intent);
    }

    public void info(View view) {
        Intent intent = new Intent(interfaz_principal.this,informacion.class);
        startActivity(intent);
    }

    public void emer(View view) {
        Intent intent = new Intent(interfaz_principal.this,emergencias.class);
        startActivity(intent);
    }

    public void cal(View view) {
        Intent intent = new Intent(interfaz_principal.this,Calculadora.class);
        startActivity(intent);
    }
}