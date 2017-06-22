package com.example.samaravile.universidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela14 extends AppCompatActivity {

    Button voltar_inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela14);

        voltar_inicio = (Button) findViewById(R.id.inicio);
    }

    public void acessarInicio(View view) {
        Intent intent = new Intent(this, nTela1.class);
        startActivity(intent);
    }
}
