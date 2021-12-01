package com.example.jogodogenio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button mais1, menos1, mais2, menos2, mais3, menos3, btnCal;
    private EditText campoA, campoB, campoC;
    private TextView txtA, txtB, txtC, txtResultado, txtTipo;
    private LinearLayout resSeg, resTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mais1 = findViewById(R.id.btn_mais1);
        menos1 = findViewById(R.id.btn_menos1);
        campoA = findViewById(R.id.edit_nA);
        txtA = findViewById(R.id.txt_a);

        mais2 = findViewById(R.id.btn_mais2);
        menos2 = findViewById(R.id.btn_menos2);
        campoB = findViewById(R.id.edit_nB);
        txtB = findViewById(R.id.txt_b);

        mais3 = findViewById(R.id.btn_mais3);
        menos3 = findViewById(R.id.btn_menos3);
        campoC = findViewById(R.id.edit_nC);
        txtC = findViewById(R.id.txt_c);

        btnCal = findViewById(R.id.btnCal);

        resSeg = findViewById(R.id.linaearSegGrau);
        resTipo = findViewById(R.id.linearTipo);
        txtResultado = findViewById(R.id.txtResultadoSegGrau);
        txtTipo = findViewById(R.id.txtResultadoTipo);

        btnMaisMenos();
        btnCalcular();
    }

    public void btnMaisMenos(){

        mais1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoA.getText()));
                int n1 = n + 1;
                String valor = Integer.toString(n1);
                campoA.setText(valor);
                txtA.setText(valor);
            }
        });

        menos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoA.getText()));
                int n1 = n - 1;
                String valor = Integer.toString(n1);
                campoA.setText(valor);
                txtA.setText(valor);
            }
        });

        mais2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoB.getText()));
                int n1 = n + 1;
                String valor = Integer.toString(n1);
                campoB.setText(valor);
                txtB.setText(valor);
            }
        });

        menos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoB.getText()));
                int n1 = n - 1;
                String valor = Integer.toString(n1);
                campoB.setText(valor);
                txtB.setText(valor);
            }
        });

        mais3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoC.getText()));
                int n1 = n + 1;
                String valor = Integer.toString(n1);
                campoC.setText(valor);
                txtC.setText(valor);
            }
        });

        menos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(String.valueOf(campoC.getText()));
                int n1 = n - 1;
                String valor = Integer.toString(n1);
                campoC.setText(valor);
                txtC.setText(valor);
            }
        });

    }

    private void btnCalcular(){

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(String.valueOf(campoA.getText()));
                int b = Integer.parseInt(String.valueOf(campoB.getText()));
                int c = Integer.parseInt(String.valueOf(campoC.getText()));
                double valor = Math.pow(b,2)- 4 * a * c;
                //String resValor = Double.toString(valor);
                txtResultado.setText(String.format("%.2f", valor));

                if (valor < 0){
                    txtTipo.setText("Não existem raizes reais");
                }else{
                    txtTipo.setText("Existem raizes reais");
                }

                resSeg.setVisibility(View.VISIBLE);
                resTipo.setVisibility(View.VISIBLE);






            }
        });
    }
}