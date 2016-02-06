package com.example.medhaparashar.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.Button signin = (android.widget.Button) findViewById(R.id.sign_in);
        signin.setOnClickListener(new android.view.View.OnClickListener() {
            // @Override
            public void onClick(android.view.View v) {
                android.widget.EditText login = (android.widget.EditText) findViewById(R.id.login_text);

                if (login.getText().length() == 0) {
                    android.widget.Toast.makeText(getApplicationContext(), "Please enter id", android.widget.Toast.LENGTH_SHORT).show();
                }
                android.widget.EditText password = (android.widget.EditText) findViewById(R.id.password_text);
                if (password.getText().length() == 0) {
                    android.widget.Toast.makeText(getApplicationContext(), "Please enter password", android.widget.Toast.LENGTH_SHORT).show();
                }
                if ((login.getText().length() != 0) && (password.getText().length() != 0)) {
                    android.widget.Toast.makeText(getApplicationContext(), "Login successful", android.widget.Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
