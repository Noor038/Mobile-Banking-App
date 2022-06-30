package com.example.oel_2.AppUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.oel_2.R;

public class AmountAddActivity extends AppCompatActivity {

    EditText edtAdd;
    int amt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount_add);
        edtAdd = findViewById(R.id.edtMoney);
        this.setTitle("Fintech");
    }

    public void onBtnAdd(View view) {

       Intent i = getIntent();
       amt = i.getIntExtra("amt" , 0);

       int amt2 = Integer.parseInt(edtAdd.getText().toString());

       amt = amt + amt2;
       Intent i2 = new Intent();

       i2.putExtra("amt", amt);
       setResult(99, i2);
       finish();//activity will be destroyed


    }
}