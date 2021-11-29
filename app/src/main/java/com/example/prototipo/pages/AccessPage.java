package com.example.prototipo.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prototipo.R;

public class AccessPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.access_page);
    }

    public void CallLoginPage(){

    }

    public  void CallRegisterPage(View view){
        Intent registerIntent = new Intent(this, RegisterPage.class);
        startActivity(registerIntent);
    }
}
