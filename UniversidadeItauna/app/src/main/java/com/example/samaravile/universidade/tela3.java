package com.example.samaravile.universidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class tela3 extends AppCompatActivity {

    Button regular;
    Button irregular;
    Button confirmarGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);


        irregular = (Button) findViewById(R.id.gradeIrregular);
        regular = (Button) findViewById(R.id.gradeRegular);
        confirmarGrade = (Button) findViewById(R.id.confirmaGrade);
    }

    public void acessarBotaoGradeIrregular(View view){
        Intent intent = new Intent(this, tela4.class);
        startActivity(intent);
    }

    public void acessarBotaoGradeRegular(View view){
        Intent intent = new Intent(this, tela4.class);
        startActivity(intent);
    }

    public void acessaConfirma(View view) {
        Intent intent = new Intent(this, tela14.class);
        startActivity(intent);
    }

}

