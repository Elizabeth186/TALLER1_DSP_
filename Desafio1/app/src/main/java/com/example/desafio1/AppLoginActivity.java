package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AppLoginActivity extends AppCompatActivity {
    EditText txtUsers, txtPassword;
    Button btnLogin, btnregistrer;
    FeedReaderDbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longin);

        txtUsers = (EditText) findViewById(R.id.users2);
        txtPassword = (EditText) findViewById(R.id.password2);
        btnLogin = (Button) findViewById(R.id.btn_Login2);
        btnregistrer = (Button) findViewById(R.id.btn_Registrer2);
        db = new FeedReaderDbHelper(this);

        btnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String users = txtUsers.getText().toString();
                String passwords = txtPassword.getText().toString();
                if (users.equals("") || passwords.equals(""))
                    Toast.makeText(AppLoginActivity.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                else {
                    Boolean Loginmain = db.userspaswordexist(users, passwords);
                    if (Loginmain == true) {
                        Toast.makeText(AppLoginActivity.this, "Successfull start", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(AppLoginActivity.this, "Failed to login", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}


