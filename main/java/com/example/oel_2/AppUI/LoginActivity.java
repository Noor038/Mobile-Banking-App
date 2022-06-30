package com.example.oel_2.AppUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.oel_2.R;

public class LoginActivity extends AppCompatActivity {

    EditText name, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setTitle("Fintech");

        name = (EditText) findViewById(R.id.name_id);
        pass = (EditText) findViewById(R.id.pass_id);

    }

    public void onBtnLoginClicked(View view) {

        if (name.getText().toString().equals("Noor")  && pass.getText().toString().equals("12345")){
            Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(i);
            finish();
        }
        else {
            Toast.makeText(getApplicationContext(), "Plz Enter Correct Credentials",Toast.LENGTH_SHORT).show();
        }

    }
}

