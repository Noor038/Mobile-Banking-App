package com.example.oel_2.AppUI;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.oel_2.R;

public class DashboardActivity extends AppCompatActivity {
    final int ACTIVITY_CLOCK=0;
    TextView txtAmt;
    static int amt = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtAmt = findViewById(R.id.txtAmt);
        this.setTitle("Fintech");

    }

    public void onBtnLogoutClicked(View view) {
        finish();
    }


    public void onBtnProfileClicked(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }


    public void onBtnAddAmt(View view) {
        amt = Integer.parseInt(txtAmt.getText().toString());
        Intent i = new Intent(DashboardActivity.this, AmountAddActivity.class);
        i.putExtra("amt", amt);
        startActivityForResult(i, ACTIVITY_CLOCK);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent i) {
        super.onActivityResult(requestCode, resultCode, i);
        if(requestCode == ACTIVITY_CLOCK) {

            amt =  i.getIntExtra("amt" , 0);
            txtAmt.setText(amt);
        }
    }



    public void onBtnFundTransferClicked(View view) {
        Intent intent = new Intent(this, UsersList.class);
        startActivity(intent);
    }

    public void onBtnTransactionHistoryClicked(View view) {
        Intent intent = new Intent(this, TransactionHistory.class);
        startActivity(intent);
    }

    public void onBtnVideoClicked(View view) {

        VideoView videoView =(VideoView)findViewById(R.id.videoPlay);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video); //set the path of the video that we need to use in our VideoView
        videoView.start();

        ImageView img = (ImageView) findViewById(R.id.img);
        img.setVisibility(View.INVISIBLE);

        Toast.makeText(getApplicationContext(), "Congratulations! You got reward of Rs. 500",Toast.LENGTH_SHORT).show();

    }
}