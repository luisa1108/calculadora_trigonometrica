package com.tamayo.calculadora_trigonometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button seno;
    Button coseno;
    Button raiz;
    Button perimetro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seno = findViewById(R.id.senob);
        coseno = findViewById(R.id.bcoseno);
        raiz = findViewById(R.id.braiz);
        perimetro = findViewById(R.id.bperimetro);

        seno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, senoActivity.class);
                startActivity(intent);
            }
        });
        coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cosenoActivity.class);
                startActivity(intent);
            }
        });
        raiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, raizActivity.class);
                startActivity(intent);
            }
        });
        perimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, perimetroActivity.class);
                startActivity(intent);
            }
        });
    }
}