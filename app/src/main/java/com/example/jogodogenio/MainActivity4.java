package com.example.jogodogenio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private SeekBar seekBarA, seekBarB, seekBarC;
    private TextView txtSegA, txtSegB, txtSegC, formaOuNao, tipoTriangulo;
    private Button btnVerificar;
    private LinearLayout aparecer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        seekBarA = findViewById(R.id.seekBarA);
        seekBarB = findViewById(R.id.seekBarB);
        seekBarC = findViewById(R.id.seekBarC);

        txtSegA = findViewById(R.id.txtSegA);
        txtSegB = findViewById(R.id.txtSegB);
        txtSegC = findViewById(R.id.txtSegC);

        btnVerificar = findViewById(R.id.btnVerificarSeg);
        aparecer = findViewById(R.id.linearTriangulo);
        formaOuNao = findViewById(R.id.formaOuNao);
        tipoTriangulo = findViewById(R.id.tipoTriangulo);

        moverBotoes();
        calcular();

    }

    public void moverBotoes() {
        seekBarA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String numeroA = Integer.toString(i);
                txtSegA.setText(numeroA);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //txtSegA.setText("onStartTrackingTouch()");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String numeroB = Integer.toString(i);
                txtSegB.setText(numeroB);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarC.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String numeroC = Integer.toString(i);
                txtSegC.setText(numeroC);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void calcular() {

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                aparecer.setVisibility(View.VISIBLE);
                int a = Integer.parseInt(String.valueOf(txtSegA.getText()));
                int b = Integer.parseInt(String.valueOf(txtSegB.getText()));
                int c = Integer.parseInt(String.valueOf(txtSegC.getText()));

                if (a < b + c && b < a + c && c < a + b) {
                    formaOuNao.setText("Forma um triangulo");
                    if (a == b && b == c) {
                        tipoTriangulo.setText("Equilatero");
                    } else if (a != b && b != c && c != a) {
                        tipoTriangulo.setText("Escaleno");
                    } else {
                        tipoTriangulo.setText("Isosceles");
                    }

                } else {
                    formaOuNao.setText("Nao forma um triangulo");
                    tipoTriangulo.setText("------");
                }
            }
        });


    }
}