package com.example.prototipo.database.repositories;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.prototipo.database.context.SQLiteContext;

public abstract class _BaseRepository<TEntity> {
    protected SQLiteDatabase _dataBase;

    public _BaseRepository(Context context){
        SQLiteContext sqLiteContext = new SQLiteContext(context);
        _dataBase = sqLiteContext.getReadableDatabase();
    }

    public abstract long Insert(TEntity entity);

    public abstract void Update(TEntity entity);

    public abstract void Get(TEntity entity);

    public abstract void Delete(TEntity entity);
}
