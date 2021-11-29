package com.example.prototipo.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prototipo.R;
import com.example.prototipo.models.Clinic;
import com.example.prototipo.models.User;

public class RegisterClinicPage extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_clinic_page);

        user = (User)getIntent().getSerializableExtra("user");
    }

    public void CancelRegisterClinic(View view) {
        Intent cancelRegisterIntent = new Intent(this, AccessPage.class);
        cancelRegisterIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(cancelRegisterIntent);
    }

    public void GoToRegisterAddressOperation(View view) {
        Clinic clinic = new Clinic();
        clinic.setName(((EditText)findViewById(R.id.editTextClinicName)).getText().toString());
        clinic.setPhone(((EditText)findViewById(R.id.editTextClinicPhone)).getText().toString());

        user.setClinic(clinic);

        Intent registerAddressIntent = new Intent(this, RegisterAddressPage.class);
        registerAddressIntent.putExtra("user", user);
        startActivity(registerAddressIntent);
    }


}
