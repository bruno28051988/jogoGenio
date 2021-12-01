package com.example.jogodogenio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private Button btnContar;
    private TextView contagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btnContar = findViewById(R.id.btnContador);
        contagem = findViewById(R.id.txtContagem);

        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cont = "";
                int i = 0;
                while (i<=8){
                    i++;
                    if (i == 3 || i == 4){
                        continue;
                    }
                    if (i == 7){
                        break;
                    }
                    cont += i + " ";
                }
                contagem.setText(cont);
            }
        });
    }
}