package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class VotesActivity extends AppCompatActivity {
    EditText etxvotes;
    Button btnsend;

    TextView resultC1, resultC2, resultC3, resultC4, total, final1, final2, final3, final4;
    double candidate1 = 0, candidate2 = 0, candidate3 = 0, candidate4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votes);
        etxvotes = (EditText) findViewById(R.id.etxvotes);
        total = (TextView) findViewById(R.id.total);
        final1 = (TextView) findViewById(R.id.final1);
        final2 = (TextView) findViewById(R.id.final2);
        final3 = (TextView) findViewById(R.id.final3);
        final4 = (TextView) findViewById(R.id.final4);
        resultC1 = (TextView) findViewById(R.id.resultC1);
        resultC2 = (TextView) findViewById(R.id.resultC2);
        resultC3 = (TextView) findViewById(R.id.resultC3);
        resultC4 = (TextView) findViewById(R.id.resultC4);
        btnsend = (Button) findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 0;
                String editvotes = etxvotes.getText().toString();
                String[] votestring;
                String delimiter = ",";
                votestring = editvotes.split(delimiter);

                for (i = 0; i < votestring.length; i++) {

                    if (votestring[i].equals("1")) {
                        candidate1++;
                    } else if (votestring[i].equals("2")) {
                        candidate2++;
                    } else if (votestring[i].equals("3")) {
                        candidate3++;
                    } else if (votestring[i].equals("4")) {
                        candidate4++;
                    }

                    double suma = candidate1 + candidate2 + candidate3 + candidate4;

                    double cant1 = ((candidate1 * 100) / 14);
                    double cant2 = ((candidate2 * 100) / 14);
                    double cant3 = ((candidate3 * 100) / 14);
                    double cant4 = ((candidate4 * 100) / 14);

                    /*EVALUANDO EMPATES*/
                    if (candidate1 > candidate2 && candidate1 > candidate3 && candidate1 > candidate4) {
                        final1.setText("Result: WINNER");
                        final2.setText("Result: PERDEDOR");
                        final3.setText("Result: PERDEDOR");
                        final4.setText("Result: PERDEDOR");
                    } else if (candidate2 > candidate1 && candidate2 > candidate3 && candidate2 > candidate4) {
                        final2.setText("Result: WINNER");
                        final1.setText("Result: PERDEDOR");
                        final3.setText("Result: PERDEDOR");
                        final4.setText("Result: PERDEDOR");
                    } else if (candidate3 > candidate1 && candidate3 > candidate2 && candidate3 > candidate4) {
                        final3.setText("Result: WINNER");
                        final1.setText("Result: PERDEDOR");
                        final2.setText("Result: PERDEDOR");
                        final4.setText("Result: PERDEDOR");
                    } else if (candidate4 > candidate1 && candidate4 > candidate2 && candidate4 > candidate3) {
                        final4.setText("Result: WINNER");
                        final1.setText("Result: LOST");
                        final2.setText("Result: LOST");
                        final3.setText("Result: LOST");
                        /*EVALUANDO GANADOR*/
                    } else if (candidate1 == candidate2 && candidate1>candidate3 && candidate1>candidate4
                            && candidate2>candidate3 && candidate2>candidate4) {
                        final1.setText("Result: TIE");
                        final2.setText("Result: TIE");
                        final3.setText("Result: LOST");
                        final4.setText("Result: LOST");
                    } else if (candidate1 == candidate3&& candidate1>candidate2 && candidate1>candidate4
                            && candidate3>candidate2 && candidate3>candidate4) {
                        final1.setText("Result: TIE");
                        final2.setText("Result: LOST");
                        final3.setText("Result: TIE");
                        final4.setText("Result: LOST");
                    } else if (candidate1 == candidate4 && candidate1>candidate3 && candidate1>candidate2
                            && candidate4>candidate2 && candidate4>candidate3) {
                        final1.setText("Result: TIE");
                        final2.setText("Result: LOST");
                        final3.setText("Result: LOST");
                        final4.setText("Result: TIE");
                    } else if (candidate2 == candidate4 && candidate2>candidate3 && candidate2>candidate1
                            && candidate4>candidate3 && candidate4>candidate1) {
                        final1.setText("Result: LOST");
                        final2.setText("Result: TIE");
                        final3.setText("Result: LOST");
                        final4.setText("Result: TIE");
                    } else if (candidate2 == candidate3&& candidate2>candidate1 && candidate2>candidate4
                            && candidate3>candidate1 && candidate3>candidate4) {
                        final1.setText("Result: LOST");
                        final2.setText("Result: TIE");
                        final3.setText("Result: TIE");
                        final4.setText("Result: LOST");
                    } else if (candidate3 == candidate4&& candidate3>candidate1 && candidate3>candidate2
                            && candidate4>candidate1 && candidate4>candidate2) {
                        final1.setText("Result: LOST");
                        final2.setText("Result: LOST");
                        final3.setText("Result: TIE");
                        final4.setText("Result  TIE");
                    }

                    total.setText("\nToltal de Votos" + String.format("%.0f",suma));

                    resultC1.setText("Votos : " + candidate1 + "\nPercent :\n" + String.format("%.2f",cant1 )+ "%");
                    resultC2.setText("Votos : " + candidate2 + "\nPercent :\n" +String.format("%.2f",cant2 )  + "%");
                    resultC3.setText("Votos : " + candidate3 + "\nPercent :\n" +String.format("%.2f",cant3 ) + "%");
                    resultC4.setText("Votos : " + candidate4 + "\nPercent :\n" +String.format("%.2f",cant4 )  + "%");
                }
            }
        });
    }
}


