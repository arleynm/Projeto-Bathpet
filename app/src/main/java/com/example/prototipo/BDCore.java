package com.example.prototipo;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

public class BDCore extends SQLiteOpenHelper
{
    public static final String nomeBanco = "clinica";
    public static final int versaoBanco = 1;

    public BDCore(Context context)
    {
        super(context, nomeBanco,null, versaoBanco);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("" +
                "create table usuario (_id integer primary key autoincrement, nome text not null, email text not null, senha text not null)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        sqLiteDatabase.execSQL("drop table usuario");
        onCreate(sqLiteDatabase);
    }
}
