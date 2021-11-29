package com.example.prototipo.database.repositories;

import android.content.ContentValues;
import android.content.Context;

import com.example.prototipo.models.Address;
import com.example.prototipo.models.User;

public class AddressRepository  extends _BaseRepository<Address> {

    public AddressRepository(Context context) {
        super(context);
    }

    @Override
    public long Insert(Address address) {
        ContentValues values = new ContentValues();

        values.put("cep",  address.getCep());
        values.put("complete_address",  address.getCompleteAddress());

        return super._dataBase.insert("address", null, values);
    }

    @Override
    public void Update(Address address) {

    }

    @Override
    public void Get(Address address) {

    }

    @Override
    public void Delete(Address address) {

    }
}
