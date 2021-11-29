package com.example.prototipo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void chamarSegundaPagina(View view)
    {
        Intent intencao = new Intent(this, MainActivity3.class);
        startActivity(intencao);
    }
    public void chamarTerceiraPagina(View view)
    {
        Intent intencao = new Intent(this, MainActivity4.class);
        startActivity(intencao);
    }
    public void chamarLogin(View view)
    {
        Intent intencao = new Intent(this, MainActivity.class);
        startActivity(intencao);
    }



}