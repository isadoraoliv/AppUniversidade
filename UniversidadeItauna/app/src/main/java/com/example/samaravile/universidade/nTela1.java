package com.example.samaravile.universidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nTela1 extends AppCompatActivity {

    Button onClick;
    Button listener;
    EditText eTNome;
    EditText eTCiu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_tela1);

        onClick = (Button) findViewById(R.id.btOnClick);
        listener = (Button) findViewById(R.id.btListener);
        eTCiu = (EditText) findViewById(R.id.eTCiu);
        eTNome = (EditText) findViewById(R.id.eTNome);

        listener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaList = new Intent(nTela1.this, tela4.class);
                telaList.putExtra("nome", eTNome.getText().toString());
                telaList.putExtra("ciu", eTCiu.getText().toString());
                startActivity(telaList);
            }
        });

    }

    public void acessarBotao(View view){
        Intent intent = new Intent(this, tela4.class);
        intent.putExtra("nome", eTNome.getText().toString());
        intent.putExtra("ciu", eTCiu.getText().toString());
        startActivity(intent);
    }

}
