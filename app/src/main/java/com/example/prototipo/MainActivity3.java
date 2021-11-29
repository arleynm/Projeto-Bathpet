package com.example.prototipo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity
{
    private Usuario usuario = new Usuario();
    private EditText nomeEt;
    private EditText emailEt;
    private EditText senhaEt;
    private Button btnSalvar;
    private EditText estadoEt;
    private EditText cidadeEt;
    private EditText Telefone;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nomeEt = (EditText) findViewById(R.id.nome);
        emailEt = (EditText) findViewById(R.id.email);;
        senhaEt = (EditText) findViewById(R.id.senha);;
        btnSalvar = (Button) findViewById(R.id.buttonsalvar);;

        Intent intent = getIntent();
        if(intent != null)
        {
            Bundle bundle = intent.getExtras();
            if(bundle != null )
            {
                usuario.setId(bundle.getLong("id"));
                usuario.setNome(bundle.getString("nome"));
                usuario.setEmail(bundle.getString("email"));

                nomeEt.setText(usuario.getNome());
                emailEt.setText(usuario.getEmail());

                senhaEt.setVisibility(View.GONE);
                btnSalvar.setVisibility(View.GONE);

            }
        }


    }

    public void salveUser(View view)
    {
        usuario.setNome(nomeEt.getText().toString());
        usuario.setEmail(emailEt.getText().toString());
        usuario.setSenha(nomeEt.getText().toString());

        Intent intencao = new Intent(this, MainActivity.class);
        startActivity(intencao);
    }
}