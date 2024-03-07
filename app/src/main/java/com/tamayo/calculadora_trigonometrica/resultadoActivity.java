package com.tamayo.calculadora_trigonometrica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultadoActivity extends AppCompatActivity {
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = findViewById(R.id.Resultado); // Ajusta el ID según tu diseño

        // Obtén el valor del coseno enviado desde la CosenoActivity
        double resultado = getIntent().getDoubleExtra("resultado", 0.0); // 0.0 es el valor predeterminado

        // Muestra el resultado en el TextView
        txtResultado.setText("Resultado: " + resultado);
    }
}
