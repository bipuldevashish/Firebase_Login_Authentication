 package com.example.firebasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_createAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_createAccount=findViewById(R.id.btn_createAccount);
        btn_createAccount.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        Toast.makeText(this, "You clicked the register button", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(i);


    }
}
