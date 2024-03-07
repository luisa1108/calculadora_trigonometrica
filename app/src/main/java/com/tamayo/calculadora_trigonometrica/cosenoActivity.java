package com.tamayo.calculadora_trigonometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class cosenoActivity extends AppCompatActivity {
    EditText angulocoseno;
    Button calcular_coseno;
    TextView resultado;

    RadioButton radioGrados;
    RadioButton radioRadianes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coseno);

        angulocoseno = findViewById(R.id.angulocoseno);
        calcular_coseno = findViewById(R.id.calcular_coseno);
        resultado = findViewById(R.id.lblresultadocoseno);
        radioGrados = findViewById(R.id.gradcoseno);
        radioRadianes = findViewById(R.id.radiancoseno);

        calcular_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String anguloString = angulocoseno.getText().toString();
                if (!anguloString.isEmpty()) {
                    double angulo = Double.parseDouble(anguloString);
                    double radianes = radioGrados.isChecked() ? Math.toRadians(angulo) : angulo;
                    double coseno = Math.cos(radianes);
                    Intent intent = new Intent(cosenoActivity.this, resultadoActivity.class);
                    intent.putExtra("resultado", coseno); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultado.setText("Por favor, ingresa un ángulo.");
                }
            }
        });
    }
}
