package com.example.samaravile.universidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela4 extends AppCompatActivity implements IAsyncHandler {

    Button primeiroP;
    Button segundoP;
    Button terceiroP;
    Button quartoP;
    Button quintoP;
    Button sextoP;
    Button setimoP;
    Button oitavoP;
    Button acessa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        //Cria a tarefa para ser executada em background
        final CommAsyncTask task = new CommAsyncTask(tela4.this);

        acessa = (Button) findViewById(R.id.confirma);
        acessa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarConfirmar1(v);

                //Aqui eu chamo a execução. Como é em background, por isso citei de usar um EventBus ou outra
                //forma de poder recuperar a informação. Não é a melhor forma, mas de forma ilustrativa, vou
                //criar um método para receber a informação e aproveitar na activity.
                task.onPostExecute("Teste!");
            }
        });


        primeiroP = (Button) findViewById(R.id.primeiro);
        primeiroP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarPrimeiroPeriodo(v);
            }
        });

        segundoP = (Button) findViewById(R.id.segundo);
        segundoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarSegundoPeriodo(v);
            }
        });

        terceiroP = (Button) findViewById(R.id.terceiro);
        terceiroP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarTerceiroPeriodo(v);
            }
        });

        quartoP = (Button) findViewById(R.id.quarto);
        quartoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarQuartoPeriodo(v);
            }
        });

        quintoP = (Button) findViewById(R.id.quinto);
        quintoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarQuintoPeriodo(v);
            }
        });

        sextoP = (Button) findViewById(R.id.sexto);
        sextoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarSextoPeriodo(v);
            }
        });

        setimoP = (Button) findViewById(R.id.setimo);
        setimoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                acessarSetimoPeriodo(v);
            }
        });

        oitavoP = (Button) findViewById(R.id.oitavo);
    }

    public void acessarPrimeiroPeriodo(View view){
        Intent intent = new Intent(this, tela6.class);
        startActivity(intent);
    }

    public void acessarSegundoPeriodo(View view){
        Intent intent = new Intent(this, tela7.class);
        startActivity(intent);
    }

    public void acessarTerceiroPeriodo(View view){
        Intent intent = new Intent(this, tela8.class);
        startActivity(intent);
    }

    public void acessarQuartoPeriodo(View view){
        Intent intent = new Intent(this, tela9.class);
        startActivity(intent);
    }

    public void acessarQuintoPeriodo(View view){
        Intent intent = new Intent(this, tela10.class);
        startActivity(intent);
    }

    public void acessarSextoPeriodo(View view){
        Intent intent = new Intent(this, tela11.class);
        startActivity(intent);
    }

    public void acessarSetimoPeriodo(View view){
        Intent intent = new Intent(this, tela12.class);
        startActivity(intent);
    }

    public void acessarOitavoPeriodo(View view){
        Intent intent = new Intent(this, tela13.class);
        startActivity(intent);
    }

    public void acessarConfirmar1(View view){
        Intent intent = new Intent(this, tela14.class);
        startActivity(intent);
    }

    @Override
    public void postResult(String result) {
        //Neste método você pega o resultado da asynctask e aproveita de alguma forma
    }
}

interface IAsyncHandler {
    void postResult(String result);
}
