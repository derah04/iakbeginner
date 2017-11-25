package com.example.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtUsername;
    TextView txtPassword;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtUsername = (TextView) findViewById(R.id.txtUsername);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
        btnBack = (Button) findViewById(R.id.btnBack);

        String getUsername = getIntent().getStringExtra("username");
        String getPassword = getIntent().getStringExtra("password");

        txtUsername.setText(getUsername);
        txtPassword.setText(getPassword);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent backActivity = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(backActivity);
            }
        });
    }
}
