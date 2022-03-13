package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DeductionActivity extends AppCompatActivity {
    double isss, afp, rent, salarybonus, calculatebonus, salary, total, calculatebonusS,
            calculatebonusA, salarybonusS, salarybonusA;
    double salarymax, calculatehoursMAXyMIN, isssmax, afpmax, rentmax, salarybonusmax, calculatebonusmax, calculatebonusmaxA, calculatebonusmaxS,
            salarybonusmaxS, salarybonusmaxA, calculatemax, totalmax, hoursmenoresmax;
    double isss2, afp2, rent2, salarybonus2, calculatebonus2, salary2, total2, calculatebonusS2, calculatebonusA2, salarybonusS2, salarybonusA2;
    double salarymax2, calculatehoursMAXyMIN2, isssmax2, afpmax2, rentmax2, salarybonusmax2, calculatebonusmax2, calculatebonusmaxA2, calculatebonusmaxS2,
            salarybonusmaxS2, salarybonusmaxA2, calculatemax2, totalmax2, hoursmenoresmax2;
    double isss3, afp3, rent3, salarybonus3, calculatebonus3, salary3, total3, calculatebonusS3, calculatebonusA3, salarybonusS3, salarybonusA3;
    double salarymax3, calculatehoursMAXyMIN3, isssmax3, afpmax3, rentmax3, salarybonusmax3, calculatebonusmax3, calculatebonusmaxA3, calculatebonusmaxS3,
            salarybonusmaxS3, salarybonusmaxA3, calculatemax3, totalmax3, hoursmenoresmax3;
    double calculatebonusG, calculatebonusmaxG, salarybonusG,salarybonusmaxG;
    double calculatebonusG2, calculatebonusmaxG2, salarybonusG2,salarybonusmaxG2;
    double calculatebonusG3, calculatebonusmaxG3, salarybonusG3,salarybonusmaxG3;
    EditText etxname1, etxwork1, etxlast1, etxhours1, etxname2, etxwork2,
            etxlast2, etxhours2, etxname3, etxwork3, etxlast3, etxhours3;
    Button btnprocess, btnadd;
    TextView txtresult, txtresult2, txtresult3, txtmaxsalary, txtbono, txtyesbono, txtsalarymax300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deduction);

        etxname1 = (EditText) findViewById(R.id.etx_name1);
        etxlast1 = (EditText) findViewById(R.id.etx_last1);
        etxwork1 = (EditText) findViewById(R.id.etx_work1);
        etxhours1 = (EditText) findViewById(R.id.etx_hours1);
        etxname2 = (EditText) findViewById(R.id.etx_name2);
        etxlast2 = (EditText) findViewById(R.id.etx_last2);
        etxwork2 = (EditText) findViewById(R.id.etx_work2);
        etxhours2 = (EditText) findViewById(R.id.etx_hours2);
        etxname3 = (EditText) findViewById(R.id.etx_name3);
        etxlast3 = (EditText) findViewById(R.id.etx_last3);
        etxwork3 = (EditText) findViewById(R.id.etx_work3);
        txtbono = (TextView) findViewById(R.id.txtbono);
        txtsalarymax300 = (TextView) findViewById(R.id.txtsalarymax300);
        txtyesbono = (TextView) findViewById(R.id.txtyesbono);
        txtmaxsalary = (TextView) findViewById(R.id.txtmaxsalary);
        etxhours3 = (EditText) findViewById(R.id.etx_hours3);
        txtresult = (TextView) findViewById(R.id.txtresult);
        txtresult2 = (TextView) findViewById(R.id.txtresult2);
        txtresult3 = (TextView) findViewById(R.id.txtresult3);
        btnprocess = (Button) findViewById(R.id.btn_process);

        btnprocess.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View v) {

                String name = etxname1.getText().toString();
                String last = etxlast1.getText().toString();
                String work = etxwork1.getText().toString();
                String hour = etxhours1.getText().toString();
                String name2 = etxname2.getText().toString();
                String last2 = etxlast2.getText().toString();
                String work2 = etxwork2.getText().toString();
                String hour2 = etxhours2.getText().toString();
                String name3 = etxname3.getText().toString();
                String last3 = etxlast3.getText().toString();
                String work3 = etxwork3.getText().toString();
                String hour3 = etxhours3.getText().toString();

                if (name.equals("") || last.equals("") || work.equals("") || hour.equals("") || name2.equals("") || last2.equals("")
                        || work2.equals("") || hour2.equals("") || name3.equals("") || last3.equals("") || work3.equals("") || hour3.equals("")) {
                    Toast.makeText(DeductionActivity.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    double hours = Double.parseDouble(etxhours1.getText().toString());
                    double hours2 = Double.parseDouble(etxhours2.getText().toString());
                    double hours3 = Double.parseDouble(etxhours3.getText().toString());
                    if (hours > 0 && hours2 > 0 && hours3 > 0) {
//                _____________________HOURS 1_____________________________________________
                        total = hours * 9.75;
                        isss = total * 0.0525;
                        afp = total * 0.0688;
                        rent = total * 0.1;

                        salary = total - isss - afp - rent;
                        calculatebonus = salary * 0.1;
                        salarybonus = salary + calculatebonus;
//                        BONUS GENERAL
                        calculatebonusG = salary * 0.02;
                        salarybonusG = salary + calculatebonusG;
//                            BONO SECRETARY
                        calculatebonusS = salary * 0.03;
                        salarybonusS = salary + calculatebonusS;
//                            BONO ASSISTANT
                        calculatebonusA = salary * 0.05;
                        salarybonusA = salary + calculatebonusA;
//                        HORAS MAYORES A 160
                        calculatemax = hours - 160;
                        hoursmenoresmax = 160 * 9.75;
                        totalmax = calculatemax * 11.50;
                        calculatehoursMAXyMIN = totalmax + hoursmenoresmax;
                        isssmax = calculatehoursMAXyMIN * 0.0525;
                        afpmax = calculatehoursMAXyMIN * 0.0688;
                        rentmax = calculatehoursMAXyMIN * 0.1;
                        salarymax = calculatehoursMAXyMIN - isssmax - afpmax - rentmax;

                        calculatebonusmax = salarymax * 0.1;
                        salarybonusmax = salarymax + calculatebonusmax;
//                        BONUS GENERAL
                        calculatebonusmaxG = salarymax * 0.02;
                        salarybonusmaxG = salarymax + calculatebonusmaxG;
//                            BONO SECRETARY
                        calculatebonusmax = salarymax * 0.03;
                        salarybonusmaxS = salarymax + calculatebonusmaxS;
//                            BONO ASSISTANT
                        calculatebonusmaxA = salarymax * 0.05;
                        salarybonusmaxA = salarymax + calculatebonusmaxA;

//                ____________________HOURS 2___________________________________________________
                        total2 = hours2 * 9.75;
                        isss2 = total2 * 0.0525;
                        afp2 = total2 * 0.0688;
                        rent2 = total2 * 0.1;

                        salary2 = total2 - isss2 - afp2 - rent2;
                        calculatebonus2 = salary2 * 0.1;
                        salarybonus2 = salary2 + calculatebonus2;
//                            BONO SECRETARY
                        calculatebonusS2 = salary2 * 0.03;
                        salarybonusS2 = salary2 + calculatebonusS2;
//                            BONO ASSISTANT
                        calculatebonusA2 = salary2 * 0.05;
                        salarybonusA2 = salary2 + calculatebonusA2;
//                        BONUS GENERAL
                        calculatebonusG2 = salary2 * 0.02;
                        salarybonusG2 = salary2 + calculatebonus2;
//                        HORAS MAYORES A 160
                        calculatemax2 = hours2 - 160;
                        hoursmenoresmax2 = 160 * 9.75;
                        totalmax2 = calculatemax2 * 11.50;
                        calculatehoursMAXyMIN2 = totalmax2 + hoursmenoresmax2;
                        isssmax2 = calculatehoursMAXyMIN2 * 0.0525;
                        afpmax2 = calculatehoursMAXyMIN2 * 0.0688;
                        rentmax2 = calculatehoursMAXyMIN2 * 0.1;
                        salarymax2 = calculatehoursMAXyMIN2 - isssmax2 - afpmax2 - rentmax2;

                        calculatebonusmax2 = salarymax2 * 0.1;
                        salarybonusmax2 = salarymax2 + calculatebonusmax2;
//                        BONUS GENERAL
                        calculatebonusmaxG2 = salarymax2 * 0.02;
                        salarybonusmaxG2 = salarymax2 + calculatebonusmaxG2;
//                            BONO SECRETARY
                        calculatebonusmax2 = salarymax2 * 0.03;
                        salarybonusmaxS2 = salarymax2 + calculatebonusmaxS2;
//                            BONO ASSISTANT
                        calculatebonusmaxA2 = salarymax2 * 0.05;
                        salarybonusmaxA2 = salarymax2 + calculatebonusmaxA2;
//                ___________________HOURS 3__________________________________________________
                        total3 = hours3 * 9.75;
                        isss3 = total3 * 0.0525;
                        afp3 = total3 * 0.0688;
                        rent3 = total3 * 0.1;

                        salary3 = total3 - isss3 - afp3 - rent3;

                        calculatebonus3 = salary3 * 0.1;
                        salarybonus3 = salary3 + calculatebonus3;
//                        BONUS GENERAL
                        calculatebonusG3 = salary3 * 0.02;
                        salarybonusG3 = salary3 + calculatebonusG3;
//                            BONO SECRETARY
                        calculatebonusS3 = salary3 * 0.03;
                        salarybonusS3 = salary3 + calculatebonusS3;
//                            BONO ASSISTANT
                        calculatebonusA3 = salary3 * 0.05;
                        salarybonus3 = salary3 + calculatebonusA3;

//                        HORAS MAYORES A 160
                        calculatemax3 = hours3 - 160;
                        hoursmenoresmax3 = 160 * 9.75;
                        totalmax3 = calculatemax3 * 11.50;
                        calculatehoursMAXyMIN3 = totalmax3 + hoursmenoresmax3;
                        isssmax3 = calculatehoursMAXyMIN3 * 0.0525;
                        afpmax3 = calculatehoursMAXyMIN3 * 0.0688;
                        rentmax3 = calculatehoursMAXyMIN3 * 0.1;
                        salarymax3 = calculatehoursMAXyMIN3 - isssmax3 - afpmax3 - rentmax3;

                        calculatebonusmax3 = salarymax3 * 0.1;
                        salarybonusmax3 = salarymax3 + calculatebonusmax3;
//                        BONUS GENERAL
                        calculatebonusmaxG3 = salarymax3 * 0.02;
                        salarybonusmaxG3 = salary3 + calculatebonusmaxG3;
//                            BONO SECRETARY
                        calculatebonusmax3 = salarymax3 * 0.03;
                        salarybonusmaxS3 = salarymax3 + calculatebonusmaxS3;
//                            BONO ASSISTANT
                        calculatebonusmaxA3 = salarymax3 * 0.05;
                        salarybonusmaxA3 = salarymax3 + calculatebonusmaxA3;

                        if (work.equalsIgnoreCase("Manager") && work2.equalsIgnoreCase("Manager")
                                && work3.equalsIgnoreCase("Manager")) {
//
                            if (hours <= 160 && hours2 <= 160 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonus), String.format("%.2f", salarybonus)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonus2), String.format("%.2f", salarybonus2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonus3), String.format("%.2f", salarybonus3)));
                                if (salarybonus > salarybonus2 && salarybonus > salarybonus3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonus)));
                                } else if (salarybonus2 > salarybonus && salarybonus2 > salarybonus3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonus2)));
                                } else if (salarybonus3 > salarybonus2 && salarybonus3 > salarybonus) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusmax3)));
                                }
                                if (salarybonus>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonus2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonus2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus2>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonus2>300&& salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 10%");
                            } else if (hours <= 160 && hours2 <= 160 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonus), String.format("%.2f", salarybonus)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonus2), String.format("%.2f", salarybonus2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmax3), String.format("%.2f", salarybonusmax3)));
                                txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusmax3)));
                                if (salarybonus>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonus2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonus2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus2>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonus2>300&& salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 10%");
                            } else if (hours <= 160 && hours2 >= 161 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonus), String.format("%.2f", salarybonus)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmax2), String.format("%.2f", salarybonusmax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonus3), String.format("%.2f", salarybonus3)));
                                txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmax2)));
                                if (salarybonus>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmax2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonusmax2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax2>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonusmax2>300&& salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 10%");
                            } else if (hours >= 161 && hours2 <= 160 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmax), String.format("%.2f", salarybonusmax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonus2), String.format("%.2f", salarybonus2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonus3), String.format("%.2f", salarybonus3)));
                                txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name, String.format("%.2f", salarybonusmax)));
                                txtyesbono.setText("BONUS 10%");
                                if (salarybonusmax>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonus2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonus2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus2>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonus2>300&& salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                            } else if (hours >= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmax), String.format("%.2f", salarybonusmax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmax2), String.format("%.2f", salarybonusmax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmax3), String.format("%.2f", salarybonusmax3)));
                                if (salarybonusmax > salarybonusmax2 && salarybonusmax > salarybonusmax3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name,String.format("%.2f", salarybonusmax)));
                                } else if (salarybonusmax2 > salarybonusmax && salarybonusmax2 > salarybonusmax3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmax2)));
                                } else if (salarybonusmax3 > salarybonusmax2 && salarybonusmax3 > salarybonusmax) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmax3)));
                                }
                                if (salarybonusmax>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmax2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonusmax2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax2>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonusmax2>300&& salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 10%");
                            }else if (hours >= 161 && hours2 >= 161 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmax), String.format("%.2f", salarybonusmax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmax2), String.format("%.2f", salarybonusmax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonus3), String.format("%.2f", salarybonus3)));
                                if (salarybonusmax > salarybonusmax2) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmax)));
                                } else if (salarybonusmax2 > salarybonusmax ) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmax2)));
                                }
                                if (salarybonusmax>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmax2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonusmax2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax2>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonus3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonusmax2>300&& salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 10%");
                            }else if (hours <= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonus), String.format("%.2f", salarybonus)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmax2), String.format("%.2f", salarybonusmax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmax3), String.format("%.2f", salarybonusmax3)));
                                if (salarybonusmax2 > salarybonusmax3 ) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name,String.format("%.2f", salarybonusmax2)));
                                } else if (salarybonusmax3 > salarybonusmax2 ) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmax3) ));
                                }
                                if (salarybonus>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmax2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonusmax2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax2>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonus>300 && salarybonusmax2>300&& salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 10%");
                            }else if (hours >= 161 && hours2 <= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmax), String.format("%.2f", salarybonusmax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonus2), String.format("%.2f", salarybonus2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmax3), String.format("%.2f", salarybonusmax3)));
                                if (salarybonusmax > salarybonusmax3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmax)));
                                } else if (salarybonusmax3 > salarybonusmax) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmax3)));
                                }
                                txtyesbono.setText("BONUS 10%");
                                if (salarybonusmax>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonus2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonus2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonus2>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmax>300 && salarybonus2>300&& salarybonusmax3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                            }
                        } else if (work.equalsIgnoreCase("Assistant") && work2.equalsIgnoreCase("Assistant")
                                && work3.equalsIgnoreCase("Assistant")) {
                            if (hours <= 160 && hours2 <= 160 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusA), String.format("%.2f", salarybonusA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusA2), String.format("%.2f", salarybonusA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusA3), String.format("%.2f", salarybonusA3)));
                                if (salarybonusA > salarybonusA2 && salarybonusA > salarybonusA3) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusA)));
                                } else if (salarybonusA2 > salarybonusA && salarybonusA2 > salarybonusA3) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusA2)));
                                } else if (salarybonusA3 > salarybonusA2 && salarybonusA3 > salarybonusA) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusA3)));
                                }
                                if (salarybonusA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA2>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusA2>300&& salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            } else if (hours <= 160 && hours2 <= 160 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusA), String.format("%.2f", salarybonusA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusA2), String.format("%.2f", salarybonusA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxA3), String.format("%.2f", salarybonusmaxA3)));
                                txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxA3)));
                                if (salarybonusA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA2>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusA2>300&& salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            } else if (hours <= 160 && hours2 >= 161 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusA), String.format("%.2f", salarybonusA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxA2), String.format("%.2f", salarybonusmaxA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusA3), String.format("%.2f", salarybonusA3)));
                                txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxA2)));
                                if (salarybonusA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusmaxA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA2>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusmaxA2>300&& salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            } else if (hours >= 161 && hours2 <= 160 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxA), String.format("%.2f", salarybonusmaxA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusA2), String.format("%.2f", salarybonusA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusA3), String.format("%.2f", salarybonusA3)));
                                txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxA)));
                                if (salarybonusmaxA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA2>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusA2>300&& salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            } else if (hours >= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxA), String.format("%.2f", salarybonusmaxA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxA2), String.format("%.2f", salarybonusmaxA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxA3), String.format("%.2f", salarybonusmaxA3)));
                                if (salarybonusmaxA > salarybonusmaxA2 && salarybonusmaxA > salarybonusmaxA3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmaxA)));
                                } else if (salarybonusmaxA2 > salarybonusmaxA && salarybonusmaxA2 > salarybonusmaxA3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxA2)));
                                } else if (salarybonusmaxA3 > salarybonusmaxA2 && salarybonusmaxA3 > salarybonusmaxA) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusmaxA3)));
                                }
                                if (salarybonusmaxA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusmaxA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA2>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusmaxA2>300&& salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            }else if (hours >= 161 && hours2 >= 161 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxA), String.format("%.2f", salarybonusmaxA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxA2), String.format("%.2f", salarybonusmaxA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusA3), String.format("%.2f", salarybonusA3)));
                                if (salarybonusmaxA > salarybonusmaxA2) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmaxA)));
                                } else if (salarybonusmaxA2 > salarybonusmaxA) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxA2)));
                                } if (salarybonusmaxA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusmaxA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA2>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusmaxA2>300&& salarybonusA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            }else if (hours <= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusA), String.format("%.2f", salarybonusA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxA2), String.format("%.2f", salarybonusmaxA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxA3), String.format("%.2f", salarybonusmaxA3)));
                                if (salarybonusmaxA2 > salarybonusmaxA3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name2, String.format("%.2f", salarybonusmaxA2)));
                                } else if (salarybonusmaxA3 > salarybonusmaxA2) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusmaxA3)));
                                }
                                if (salarybonusA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusmaxA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA2>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusA>300 && salarybonusmaxA2>300&& salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            }else if (hours >= 161 && hours2 <= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxA), String.format("%.2f", salarybonusmaxA)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusA2), String.format("%.2f", salarybonusA2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxA3), String.format("%.2f", salarybonusmaxA3)));
                                if (salarybonusmaxA > salarybonusmaxA3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name,String.format("%.2f", salarybonusmaxA)));
                                } else if (salarybonusmaxA3 > salarybonusmaxA ){
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusmaxA3)));
                                }
                                if (salarybonusmaxA>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusA2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusA2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusA2>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxA>300 && salarybonusA2>300&& salarybonusmaxA3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 5%");
                            }
                        } else if (work.equalsIgnoreCase("Secretary") && work2.equalsIgnoreCase("Secretary")
                                && work3.equalsIgnoreCase("Secretary")) {
                            if (hours <= 160 && hours2 <= 160 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusS), String.format("%.2f", salarybonusS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusS2), String.format("%.2f", salarybonusS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusS3), String.format("%.2f", salarybonusS3)));
                                if (salarybonusS > salarybonusS2 && salarybonusS > salarybonusS3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusS)));
                                } else if (salarybonusS2 > salarybonusS && salarybonusS2 > salarybonusS3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusS2)));
                                } else if (salarybonusS3 > salarybonusS2 && salarybonusS3 > salarybonusS) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusS3)));

                                } if (salarybonusS>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusS2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusS2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusS2>300 && salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusS2>300&& salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 3%");
                            } else if (hours <= 160 && hours2 <= 160 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusS), String.format("%.2f", salarybonusS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusS2), String.format("%.2f", salarybonusS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxS3), String.format("%.2f", salarybonusmaxS3)));
                                txtmaxsalary.setText(String.format("the job: %s got the highest salary de: de: %s", name2, String.format("%.2f", salarybonusmaxS3)));
                             if (salarybonusS>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                            }else if(salarybonusS2>300){
                                txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                            }else if(salarybonusmaxS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }else if(salarybonusS>300 && salarybonusS2>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                            }else if(salarybonusS2>300 && salarybonusmaxS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }else if(salarybonusS>300 && salarybonusmaxS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }else if(salarybonusS>300 && salarybonusS2>300&& salarybonusmaxS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }
                                txtyesbono.setText("BONUS 3%");
                            } else if (hours <= 160 && hours2 >= 161 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusS), String.format("%.2f", salarybonusS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxS2), String.format("%.2f", salarybonusmaxS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusS3), String.format("%.2f", salarybonusS3)));
                                txtmaxsalary.setText(String.format("the job: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxS2)));
                                if (salarybonusS>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxS2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusmaxS2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxS2>300 && salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusmaxS2>300&& salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 3%");
                            } else if (hours >= 161 && hours2 <= 160 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxS), String.format("%.2f", salarybonusmaxS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusS2), String.format("%.2f", salarybonusS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusS3), String.format("%.2f", salarybonusS3)));
                                txtmaxsalary.setText(String.format("the job: %s got the highest salary de: %s", name2,String.format("%.2f", salarybonusmaxS)));
                                if (salarybonusmaxS>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusS2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusS2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusS2>300 && salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusS2>300&& salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 3%");
                            } else if (hours >= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxS), String.format("%.2f", salarybonusmaxS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxS2), String.format("%.2f", salarybonusmaxS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxS3), String.format("%.2f", salarybonusmaxS3)));
                                if (salarybonusmaxS > salarybonusmaxS2 && salarybonusmaxS > salarybonusmaxS3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmaxS)));
                                } else if (salarybonusmaxS2 > salarybonusmaxS && salarybonusmaxS2 > salarybonusmaxS3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxS2)));
                                } else if (salarybonusmaxS3 > salarybonusmaxS2 && salarybonusmaxS3 > salarybonusmaxS) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmaxS3)));
                                }
                                if (salarybonusmaxS>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxS2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusmaxS2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxS2>300 && salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusmaxS2>300&& salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 3%");
                            }else if (hours >= 161 && hours2 >= 161 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxS), String.format("%.2f", salarybonusmaxS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxS2), String.format("%.2f", salarybonusmaxS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusS3), String.format("%.2f", salarybonusS3)));
                                if (salarybonusmaxS > salarybonusmaxS2) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmaxS)));
                                } else if (salarybonusmaxS2 > salarybonusmaxS) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxS2)));
                                }
                                if (salarybonusmaxS>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxS2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusmaxS2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxS2>300 && salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusmaxS>300 && salarybonusmaxS2>300&& salarybonusS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 3%");
                            }else if (hours <= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusS), String.format("%.2f", salarybonusS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxS2), String.format("%.2f", salarybonusmaxS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxS3), String.format("%.2f", salarybonusmaxS3)));
                                if (salarybonusmaxS2 > salarybonusmaxS3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name2, String.format("%.2f", salarybonusmaxS2)));
                                } else if (salarybonusmaxS3 > salarybonusmaxS2) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmaxS3)));
                                }
                                if (salarybonusS>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                }else if(salarybonusmaxS2>300){
                                    txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusmaxS2>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                }else if(salarybonusmaxS2>300 && salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }else if(salarybonusS>300 && salarybonusmaxS2>300&& salarybonusmaxS3>300){
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                }
                                txtyesbono.setText("BONUS 3%");
                            }else if (hours >= 161 && hours2 <= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxS), String.format("%.2f", salarybonusmaxS)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusS2), String.format("%.2f", salarybonusS2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxS3), String.format("%.2f", salarybonusmaxS3)));
                                if (salarybonusmaxS > salarybonusmaxS3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name,String.format("%.2f", salarybonusmaxS)));
                                } else if (salarybonusmaxS3 > salarybonusmaxS ){
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmaxS3)));
                                }

                            }
                            if (salarybonusmaxS>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                            }else if(salarybonusS2>300){
                                txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                            }else if(salarybonusmaxS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }else if(salarybonusmaxS>300 && salarybonusS2>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                            }else if(salarybonusS2>300 && salarybonusmaxS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }else if(salarybonusmaxS>300 && salarybonusS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }else if(salarybonusmaxS>300 && salarybonusS2>300&& salarybonusS3>300){
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                            }
                            txtyesbono.setText("BONUS 3%");

                        } else if (work.equalsIgnoreCase("Manager") && work2.equalsIgnoreCase("Assistant")
                                && work3.equalsIgnoreCase("Secretary")) {
                            if (hours <= 160 && hours2 <= 160 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3)));
                                if (salary > salary2 && salary > salary3) {
                                    txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name, String.format("%.2f", salary)));
                                } else if (salary2 > salary && salary2 > salary3) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name2, String.format("%.2f", salary2)));
                                } else if (salary3 > salary2 && salary3 > salary) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name3, String.format("%.2f", salary3)));
                                }

                                txtbono.setText("NO BONUS");
                            } else if (hours <= 160 && hours2 <= 160 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3)));
                                txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name3, String.format("%.2f", salarymax3)));
                                txtbono.setText("NO BONUS");
                            } else if (hours <= 160 && hours2 >= 161 && hours3 <= 160) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBono : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBono : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBono : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3)));
                                txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name2, String.format("%.2f", salarymax2)));
                                txtbono.setText("NO BONUS");
                            } else if (hours >= 161 && hours2 <= 160 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3)));
                                txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name, String.format("%.2f", salarymax)));
                                txtbono.setText("NO BONUS");
                            } else if (hours >= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3)));

                                if (salarymax > salarymax2 && salarymax > salarymax3) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary, de: %s", name, String.format("%.2f", salarymax)));

                                } else if (salarymax2 > salarymax && salarymax2 > salarymax3) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name2, String.format("%.2f", salarymax2)));
                                } else if (salarymax3 > salarymax2 && salarymax3 > salarymax) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name3, String.format("%.2f", salarymax3)));
                                }

                                txtbono.setText("NO BONUS");
                            } else if (hours >= 161 && hours2 >= 161 && hours3 <= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3)));
                                if (salarymax > salarymax2) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary, de: %s", name, String.format("%.2f", salarymax)));

                                } else if (salarymax2 > salarymax) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name2, String.format("%.2f", salarymax2)));
                                }

                                txtbono.setText("NO BONUS");
                            } else if (hours <= 161 && hours2 >= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBono : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBono : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBono : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3)));

                                if (salarymax2 > salarymax3) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary, de: %s", name, String.format("%.2f", salarymax2)));

                                } else if (salarymax3 > salarymax2) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name3, String.format("%.2f", salarymax3)));

                                }

                                txtbono.setText("NO BONUS");
                            } else if (hours >= 161 && hours2 <= 161 && hours3 >= 161) {
                                txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax)));
                                txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2)));
                                txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3)));

                                if (salarymax > salarymax3) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary, de: %s", name, String.format("%.2f", salarymax)));

                                } else if (salarymax3 > salarymax) {
                                    txtmaxsalary.setText(String.format("the worker:  %s got the highest salary de: %s", name2, String.format("%.2f", salarymax3)));

                                }

                                txtbono.setText("NO BONUS");
                            }

                        }  else {

                                if (hours <= 160 && hours2 <= 160 && hours3 <= 160) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusG), String.format("%.2f", salarybonusG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusS2), String.format("%.2f", salarybonusS2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusS3), String.format("%.2f", salarybonusS3)));
                                    if (salarybonusG > salarybonusG2 && salarybonusG > salarybonusG3) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusG)));
                                    } else if (salarybonusG2 > salarybonusG && salarybonusG2 > salarybonusG3) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusG2)));
                                    } else if (salarybonusG3 > salarybonusG2 && salarybonusG3 > salarybonusG) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3, String.format("%.2f", salarybonusG3)));
                                    }
                                    if (salarybonusG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    }else if(salarybonusG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusG2>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusG2>300&& salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }
                                    txtyesbono.setText("BONUS 2%");
                                } else if (hours <= 160 && hours2 <= 160 && hours3 >= 161) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusG), String.format("%.2f", salarybonusG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusG2), String.format("%.2f", salarybonusG2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRenta: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxG3), String.format("%.2f", salarybonusmaxG3)));
                                    txtmaxsalary.setText(String.format("the job: %s got the highest salary de: de: %s", name2, String.format("%.2f", salarybonusmaxG3)));
                                    if (salarybonusG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    }else if(salarybonusG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusG2>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusG2>300&& salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }
                                    txtyesbono.setText("BONUS 2%");
                                } else if (hours <= 160 && hours2 >= 161 && hours3 <= 160) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusG), String.format("%.2f", salarybonusG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxG2), String.format("%.2f", salarybonusmaxG2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusG3), String.format("%.2f", salarybonusG3)));
                                    txtmaxsalary.setText(String.format("the job: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxG2)));
                                    if (salarybonusG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    }else if(salarybonusmaxG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusmaxG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusmaxG2>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusmaxG2>300&& salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }
                                    txtyesbono.setText("BONUS 2%");
                                } else if (hours >= 161 && hours2 <= 160 && hours3 <= 161) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxG), String.format("%.2f", salarybonusmaxG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusG2), String.format("%.2f", salarybonusG2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusG3), String.format("%.2f", salarybonusG3)));
                                    txtmaxsalary.setText(String.format("the job: %s got the highest salary de: %s", name2,String.format("%.2f", salarybonusmaxG)));
                                    if (salarybonusmaxG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    }else if(salarybonusG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusG2>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusG2>300&& salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }
                                    txtyesbono.setText("BONUS 2%");
                                } else if (hours >= 161 && hours2 >= 161 && hours3 >= 161) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxG), String.format("%.2f", salarybonusmaxG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxG2), String.format("%.2f", salarybonusmaxG2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxG3), String.format("%.2f", salarybonusmaxG3)));
                                    if (salarybonusmaxG > salarybonusmaxG2 && salarybonusmaxG > salarybonusmaxG3) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmaxG)));
                                    } else if (salarybonusmaxG2 > salarybonusmaxG && salarybonusmaxG2 > salarybonusmaxG3) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxG2)));
                                    } else if (salarybonusmaxG3 > salarybonusmaxG2 && salarybonusmaxG3 > salarybonusmaxG) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmaxG3)));
                                    }
                                    if (salarybonusmaxG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    }else if(salarybonusmaxG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusmaxG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusmaxG2>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusmaxG2>300&& salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }
                                    txtyesbono.setText("BONUS 2%");
                                }else if (hours >= 161 && hours2 >= 161 && hours3 <= 161) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxG), String.format("%.2f", salarybonusmaxG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxG2), String.format("%.2f", salarybonusmaxG2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isss3), String.format("%.2f", afp3), String.format("%.2f", rent3), String.format("%.2f", salary3), String.format("%.2f", calculatebonusG3), String.format("%.2f", salarybonusG3)));
                                    if (salarybonusmaxG > salarybonusmaxG2) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name, String.format("%.2f", salarybonusmaxG)));
                                    } else if (salarybonusmaxG2 > salarybonusmaxG) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name2, String.format("%.2f", salarybonusmaxG2)));
                                    }
                                    if (salarybonusmaxG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    }else if(salarybonusmaxG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusmaxG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusmaxG2>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusmaxG>300 && salarybonusmaxG2>300&& salarybonusG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }
                                    txtyesbono.setText("BONUS 2%");
                                }else if (hours <= 161 && hours2 >= 161 && hours3 >= 161) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isss), String.format("%.2f", afp), String.format("%.2f", rent), String.format("%.2f", salary), String.format("%.2f", calculatebonusG), String.format("%.2f", salarybonusG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isssmax2), String.format("%.2f", afpmax2), String.format("%.2f", rentmax2), String.format("%.2f", salarymax2), String.format("%.2f", calculatebonusmaxG2), String.format("%.2f", salarybonusmaxG2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxG3), String.format("%.2f", salarybonusmaxG3)));
                                    if (salarybonusmaxG2 > salarybonusmaxG3) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name2, String.format("%.2f", salarybonusmaxG2)));
                                    } else if (salarybonusmaxG3 > salarybonusmaxG2) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmaxG3)));
                                    }
                                    if (salarybonusG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                    }else if(salarybonusmaxG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusmaxG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                    }else if(salarybonusmaxG2>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }else if(salarybonusG>300 && salarybonusmaxG2>300&& salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);
                                    }
                                    txtyesbono.setText("BONUS 2%");
                                }else if (hours >= 161 && hours2 <= 161 && hours3 >= 161) {
                                    txtresult.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name, last, String.format("%.2f", isssmax), String.format("%.2f", afpmax), String.format("%.2f", rentmax), String.format("%.2f", salarymax), String.format("%.2f", calculatebonusmaxG), String.format("%.2f", salarybonusmaxG)));
                                    txtresult2.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name2, last2, String.format("%.2f", isss2), String.format("%.2f", afp2), String.format("%.2f", rent2), String.format("%.2f", salary2), String.format("%.2f", calculatebonusG2), String.format("%.2f", salarybonusG2)));
                                    txtresult3.setText(String.format("Name: %s  %s\nIsss: %s\nAfp: %s\nRent: %s\nsalary : %s\nBonus : %s\nSalary + bonus: %s", name3, last3, String.format("%.2f", isssmax3), String.format("%.2f", afpmax3), String.format("%.2f", rentmax3), String.format("%.2f", salarymax3), String.format("%.2f", calculatebonusmaxG3), String.format("%.2f", salarybonusmaxG3)));
                                    if (salarybonusmaxG > salarybonusmaxG3) {
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary, de: %s", name,String.format("%.2f", salarybonusmaxG)));
                                    } else if (salarybonusmaxG3 > salarybonusmaxG ){
                                        txtmaxsalary.setText(String.format("the worker: %s got the highest salary de: %s", name3,String.format("%.2f", salarybonusmaxG3)));
                                    }
                                    if (salarybonusmaxG>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);}
                                      if(salarybonusG2>300){
                                        txtmaxsalary.setText("Income greater than or equal to 300: \n"+name2);}
                                     if(salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);}
                                    if(salarybonusmaxG>300 && salarybonusG2>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);}
                                    if(salarybonusG2>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);}
                                    if(salarybonusG>300 && salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);}
                                    if(salarybonusmaxG>300 && salarybonusG2>300&& salarybonusmaxG3>300){
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name2);
                                        txtsalarymax300.setText("Income greater than or equal to 300: \n"+name3);}


                                    txtyesbono.setText("BONUS 2%");
                                }

                            }
                    } else {
                        Toast.makeText(DeductionActivity.this, "Hours must be greater than zero", Toast.LENGTH_SHORT).show();
                    }

                }
            }


        });


    }
}