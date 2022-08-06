package com.siva.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView txtMsgFName = findViewById(R.id.txtMsgFName);
        TextView txtMsgLName = findViewById(R.id.txtMsgLName);
        TextView txtMsgEmail = findViewById(R.id.txtMsgEmail);

        EditText edtTxtFName = findViewById(R.id.edtTxtFName);
        EditText edtTxtLName = findViewById(R.id.edtTxtLName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtMsgFName.setText("First Name: " + edtTxtFName.getText().toString());
        txtMsgLName.setText("Last Name: " + edtTxtLName.getText().toString());
        txtMsgEmail.setText("Email: " + edtTxtEmail.getText().toString());
    }
}