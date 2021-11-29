package com.example.prototipo.database.repositories;

import android.content.ContentValues;
import android.content.Context;

import com.example.prototipo.models.Clinic;
import com.example.prototipo.models.User;

public class ClinicRepository extends _BaseRepository<Clinic>{

    private long addressId;

    public ClinicRepository(long addressId, Context context) {
        super(context);
        this.addressId = addressId;
    }

    @Override
    public long Insert(Clinic clinic) {
        ContentValues values = new ContentValues();

        values.put("name",  clinic.getName());
        values.put("email",  clinic.getPhone());
        values.put("address_id",  addressId);

        return super._dataBase.insert("clinic", null, values);
    }

    @Override
    public void Update(Clinic clinic) {

    }

    @Override
    public void Get(Clinic clinic) {

    }

    @Override
    public void Delete(Clinic clinic) {

    }
}
