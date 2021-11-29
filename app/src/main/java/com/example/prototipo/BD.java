package com.example.prototipo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class BD
{
    private SQLiteDatabase bd;

    public BD(Context context)
    {
        BDCore auxBd = new BDCore(context);
        bd = auxBd.getReadableDatabase();

    }

    private void Inserir (Usuario usuario){
        ContentValues valores = new ContentValues();

        valores.put("nome",  usuario.getNome());
        valores.put("email",  usuario.getEmail());
        valores.put("senha",  usuario.getSenha());

        bd.insert("usuario", null, valores);
    };

}
