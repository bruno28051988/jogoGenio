package com.example.jogodogenio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private Button btn;
    private EditText valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.txt_res);
        btn = findViewById(R.id.btn);
        valor = findViewById(R.id.edit_valor);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Random random = new Random();
                // int numero = random.nextInt(6);
                double n = 1 + Math.random() * (6-1);
                int valor1 = (int) n;
                String valorRes = Integer.toString(valor1);

               int campoValor = Integer.parseInt(String.valueOf(valor.getText()));

                if (campoValor == valor1){
                    resultado.setText("ADIVINHOU, eu estava pensando no " + valorRes);
                }else{
                    resultado.setText("ERROU, eu estava pensando no " + valorRes);
                }


            }
        });


    }
}