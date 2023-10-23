package com.example.minhacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnSoma, btnSub, btnDivi, btnMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnDivi = findViewById(R.id.btnDivi);
        btnMulti = findViewById(R.id.btnMulti);

        btnSoma.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent tela = new Intent(MainActivity.this, Soma.class);

                startActivity(tela);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent tela = new Intent(MainActivity.this, Subtracao.class);

                startActivity(tela);
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent tela = new Intent(MainActivity.this, Dividir.class);

                startActivity(tela);
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent tela = new Intent(MainActivity.this, Multiplicacao.class);

                startActivity(tela);
            }
        });
    }
}