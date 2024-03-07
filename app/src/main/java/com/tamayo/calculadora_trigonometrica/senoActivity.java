package com.tamayo.calculadora_trigonometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class senoActivity extends AppCompatActivity {

    EditText Anguloseno;
    RadioButton grados, radianes;
    Button calcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seno);

        // Inicializa las vistas
        Anguloseno = findViewById(R.id.anguloseno);
        grados = findViewById(R.id.radgrados);
        radianes = findViewById(R.id.radradianes);
        calcular = findViewById(R.id.calcularseno);
        resultado = findViewById(R.id.lblresultadoseno);

        // Agrega el listener al botón de cálculo
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén el ángulo ingresado por el usuario
                double angle = Double.parseDouble(Anguloseno.getText().toString());

                // Calcula el seno según la selección del usuario (grados o radianes)
                if (grados.isChecked()) {
                    // Ángulo en grados
                    double radians = Math.toRadians(angle);
                    double sinValue = Math.sin(radians);
                    Intent intent = new Intent(senoActivity.this, resultadoActivity.class);
                    intent.putExtra("resultado", sinValue); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else if (radianes.isChecked()) {
                    // Ángulo en radianes
                    double sinValue = Math.sin(angle);
                    Intent intent = new Intent(senoActivity.this, resultadoActivity.class);
                    intent.putExtra("resultado", sinValue); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultado.setText("Por favor, selecciona el tipo de ángulo.");
                }

            }
        });
    }
}
