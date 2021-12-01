package com.example.jogodogenio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private Button mais, menos;
    private EditText campoNumero;
    private TextView campoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        mais = findViewById(R.id.btnMaisMain6);
        menos = findViewById(R.id.btnMenosMain6);
        campoNumero = findViewById(R.id.editNumeroMain6);
        campoResultado = findViewById(R.id.txtResMain6);

        maisMenos();
    }

    private void maisMenos(){

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoNumero.getText()));
                n += 1;
                String acrescenta = Integer.toString(n);
                campoNumero.setText(acrescenta);

                int f = 1;
                int c = n;
                while (c >= 1){
                   f *= c;
                   c--;
                }
                campoResultado.setText(Integer.toString(f));


            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoNumero.getText()));
                n -= 1;
                String diminui = Integer.toString(n);
                campoNumero.setText(diminui);

                int f = 1;
                int c = n;
                while (c >= 1){
                    f *= c;
                    c--;
                }
                campoResultado.setText(Integer.toString(f));


            }
        });
    }
}

