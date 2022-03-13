package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button equation, votes, deduction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        equation = (Button) findViewById(R.id.btn_equation);
        votes = (Button) findViewById(R.id.btn_votes);
        deduction = (Button) findViewById(R.id.btn_deduction);

        equation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EquationActivity.class);
                startActivity(intent);
            }
        });

        votes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VotesActivity.class);
                startActivity(intent);
            }
        });

        deduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DeductionActivity.class);
                startActivity(intent);
            }
        });
    }
}