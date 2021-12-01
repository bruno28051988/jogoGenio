package com.example.jogodogenio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText campoNumber;
    private Button btnVerificar;
    private TextView txtResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        campoNumber = findViewById(R.id.value);
        btnVerificar = findViewById(R.id.btnVerificar);
        txtResp = findViewById(R.id.editRes);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int preenchido = Integer.parseInt(String.valueOf(campoNumber.getText()));

                int imparOuPar = preenchido % 2;

                if (imparOuPar == 0){
                    txtResp.setText("Par");
                }else{
                    txtResp.setText("Impar");
                }
            }
        });
    }
}