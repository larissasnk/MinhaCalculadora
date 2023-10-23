package com.example.minhacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Soma extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;
    Button btnResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        num1 = findViewById(R.id.txtSoma1);
        num2 = findViewById(R.id.txtSoma2);

        resultado = findViewById(R.id.txtResultado);

        btnResultado = findViewById(R.id.btnResultado);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strNmr1 = num1.getText().toString();
                String strNmr2 = num2.getText().toString();

                float num1 = Float.parseFloat(strNmr1);
                float num2 = Float.parseFloat(strNmr2);

                float soma = num1 + num2;

                String resultadotxt = String.valueOf(soma);

                resultado.setText(resultadotxt);

            }
        });
    }
}