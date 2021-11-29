package com.example.prototipo.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prototipo.R;
import com.example.prototipo.database.context.SQLiteContext;
import com.example.prototipo.database.repositories.AddressRepository;
import com.example.prototipo.database.repositories.ClinicRepository;
import com.example.prototipo.database.repositories.UserRepository;
import com.example.prototipo.models.Address;
import com.example.prototipo.models.Clinic;
import com.example.prototipo.models.User;

import java.util.ArrayList;

public class RegisterAddressPage extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_address_page);

        user = (User)getIntent().getSerializableExtra("user");
    }

    public void CancelAddressRegister(View view) {
        Intent cancelRegisterIntent = new Intent(this, AccessPage.class);
        cancelRegisterIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(cancelRegisterIntent);
    }

    public void FinishRegister(View view) {
        Address address = new Address();
        address.setCep(((EditText)findViewById(R.id.editTextClinicCep)).getText().toString());
        address.setCompleteAddress(((EditText)findViewById(R.id.editTextClinicAddress)).getText().toString());

        user.getClinic().setAddress(address);

        AddressRepository addressRepository = new AddressRepository(getBaseContext());
        long addressId = addressRepository.Insert(user.getClinic().getAddress());

        ClinicRepository clinicRepository = new ClinicRepository(addressId, getBaseContext());
        long clinicId = clinicRepository.Insert(user.getClinic());

        UserRepository userRepository = new UserRepository(clinicId, getBaseContext());
        userRepository.Insert(user);

        Intent homeIntent = new Intent(this, HomePage.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }
}
