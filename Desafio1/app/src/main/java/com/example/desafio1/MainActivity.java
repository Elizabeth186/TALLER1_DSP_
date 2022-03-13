package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsers, txtPassword, txtPaswordrepit;
    Button login, registrer;
    FeedReaderDbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsers = (EditText) findViewById(R.id.users);
        txtPassword = (EditText) findViewById(R.id.password);
        txtPaswordrepit = (EditText) findViewById(R.id.passwordrepit);
        login = (Button) findViewById(R.id.btn_Login);
        registrer = (Button) findViewById(R.id.btn_Registrer);
        db = new FeedReaderDbHelper(this);
        registrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String users = txtUsers.getText().toString();
                String passwords = txtPassword.getText().toString();
                String repitpasword = txtPaswordrepit.getText().toString();

                if (users.equals("") || passwords.equals("") || repitpasword.equals(""))
                    Toast.makeText(MainActivity.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (passwords.equals(repitpasword)) {
                        Boolean UsersValid = db.usersexist(users);
                        if (UsersValid == false) {
                            Boolean insert = db.insertdb(users, passwords);
                            if (insert == true) {
                                Toast.makeText(MainActivity.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(MainActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "The user already exists, please log in with your account", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    }
                }
            }


        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AppLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}