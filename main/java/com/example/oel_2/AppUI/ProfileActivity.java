package com.example.oel_2.AppUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.oel_2.R;

public class ProfileActivity extends AppCompatActivity {

    static int amt = 1000;
    final int ACTIVITY_CLOCK=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        this.setTitle("Fintech");
    }

    public void onBtnAddAmtClicked(View view) {

            Intent i = new Intent(ProfileActivity.this, AmountAddActivity.class);
            i.putExtra("amt", amt);
            startActivityForResult(i, ACTIVITY_CLOCK);
        }

        protected void onActivityResult(int requestCode, int resultCode, Intent i) {
            super.onActivityResult(requestCode, resultCode, i);
            if(requestCode == ACTIVITY_CLOCK) {

                amt =  i.getIntExtra("amt" , 0);
            }
        }
    }
