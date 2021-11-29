package com.example.prototipo.database.repositories;

import android.content.ContentValues;
import android.content.Context;

import com.example.prototipo.models.User;

public class UserRepository extends _BaseRepository<User> {

    private long clinicId;

    public UserRepository(long clinicId, Context context) {
        super(context);
        this.clinicId = clinicId;
    }

    @Override
    public long Insert(User user) {
        ContentValues values = new ContentValues();

        values.put("name",  user.getName());
        values.put("email",  user.getEmail());
        values.put("password",  user.getPassword());
        values.put("clinic_id", clinicId);

        return super._dataBase.insert("user", null, values);
    }

    @Override
    public void Update(User user) {

    }

    @Override
    public void Get(User user) {

    }

    @Override
    public void Delete(User user) {

    }
}
