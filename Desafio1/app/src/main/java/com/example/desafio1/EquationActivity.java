package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EquationActivity extends AppCompatActivity {
    EditText value_A, value_B, value_C;
    TextView txtresult;
    Button btncalulate, btnclean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation);

        value_A = (EditText) findViewById(R.id.value_A);
        value_B = (EditText) findViewById(R.id.value_B);
        value_C = (EditText) findViewById(R.id.value_C);
        txtresult = (TextView) findViewById(R.id.txtresult);
        btncalulate = (Button) findViewById(R.id.btncalculate);
        btnclean = (Button) findViewById(R.id.btnclean);

        btnclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A.setText("");
                value_B.setText("");
                value_C.setText("");
            }
        });
        btncalulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value_a = value_A.getText().toString();
                String value_b = value_B.getText().toString();
                String value_c = value_C.getText().toString();
                if (value_a.equals("") || value_b.equals("") || value_c.equals("")) {

                    Toast.makeText(EquationActivity.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                } else {

                    int A = Integer.parseInt(value_A.getText().toString());
                    int B = Integer.parseInt(value_B.getText().toString());
                    int C = Integer.parseInt(value_C.getText().toString());

                    double E1 = (B * B);
                    double E2 = (4 * (A * C));
                    double E3 = (E1 - E2);
                    double result = Math.sqrt(E3);

                    if (result <= 0) {
                        txtresult.setText("There is no solution, its result is zero = 0");
                    } else {
                        double x1 = ((-B - result) / (2 * A));
                        double x2 = ((-B + result) / (2 * A));
                        txtresult.setText("\n\nRESULTS OBTAINED\n\n Value X1 (-) = " + x1 + "\n\nValue X2 (+) = " + x2);
                    }
                }
            }
        });
    }
}