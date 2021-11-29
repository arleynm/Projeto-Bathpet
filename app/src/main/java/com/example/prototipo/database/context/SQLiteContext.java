package com.example.prototipo.database.context;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteContext extends SQLiteOpenHelper
{
    public static final String DATA_BASE_NAME = "clinic.db";
    public static final int DATA_BASE_VERSION = 1;

    public SQLiteContext(Context context)
    {
        super(context, DATA_BASE_NAME, null, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String createAddressTableSql = "" +
                "create table address(" +
                "_id integer primary key autoincrement," +
                "cep text not null," +
                "complete_address text not null)";

        String createClinicTableSql = "" +
                "create table clinic(" +
                "_id integer primary key autoincrement," +
                "name text not null," +
                "phone text not null," +
                "address_id integer not null," +
                "foreign key (address_id) references address (_id))";

        String createUserTableSql = "" +
                "create table user(" +
                "_id integer primary key autoincrement," +
                "name text not null," +
                "password text not null," +
                "clinic_id integer not null," +
                "foreign key (clinic_id) references address (_id))";

        sqLiteDatabase.execSQL(createAddressTableSql);
        sqLiteDatabase.execSQL(createClinicTableSql);
        sqLiteDatabase.execSQL(createUserTableSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table user");
        sqLiteDatabase.execSQL("drop table clinic");
        sqLiteDatabase.execSQL("drop table address");
        onCreate(sqLiteDatabase);
    }
}
