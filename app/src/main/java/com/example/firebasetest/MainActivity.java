 package com.example.firebasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    Button btn_createAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_createAccount=findViewById(R.id.btn_createAccount);
        btn_createAccount.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_register);
    }
}
