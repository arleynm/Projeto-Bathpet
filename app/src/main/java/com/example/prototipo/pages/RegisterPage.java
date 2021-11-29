package com.example.prototipo.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prototipo.R;
import com.example.prototipo.models.User;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
    }

    public void CancelRegister(View view) {
        Intent cancelRegisterIntent = new Intent(this, AccessPage.class);
        cancelRegisterIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(cancelRegisterIntent);
    }

    public void GoToRegisterClinic(View view) {
        User user = new User();
        user.setName(((EditText)findViewById(R.id.editTextName)).getText().toString());
        user.setEmail(((EditText)findViewById(R.id.editTextEmail)).getText().toString());
        user.setPassword(((EditText)findViewById(R.id.editTextPassword)).getText().toString());

        Intent registerClinicIntent = new Intent(this, RegisterClinicPage.class);
        registerClinicIntent.putExtra("user", user);
        startActivity(registerClinicIntent);
    }
}
