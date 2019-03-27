package com.example.riskcalc;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MyActivity";

    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    EditText age_;
    EditText pressure_;
    Button calculate;
    RadioButton gender_;
    RadioButton smoke_;
    RadioButton diabetes_;
    RadioButton attack_;
    RadioButton history_;
    RadioButton murmur_;
    RadioButton electro_;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = (RadioGroup) findViewById(R.id.rg1);
        radioGroup2 = (RadioGroup) findViewById(R.id.rg2);
        radioGroup3 = (RadioGroup) findViewById(R.id.rg3);
        radioGroup4 = (RadioGroup) findViewById(R.id.rg4);
        radioGroup5 = (RadioGroup) findViewById(R.id.rg5);
        radioGroup6 = (RadioGroup) findViewById(R.id.rg6);
        radioGroup7 = (RadioGroup) findViewById(R.id.rg7);
        age_ = (EditText) findViewById(R.id.add_age);
        pressure_ = (EditText) findViewById(R.id.add_pressure);
        calculate = (Button) findViewById(R.id.calc);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();

                int selectedId2 = radioGroup2.getCheckedRadioButtonId();

                int selectedId3 = radioGroup3.getCheckedRadioButtonId();

                int selectedId4 = radioGroup4.getCheckedRadioButtonId();

                int selectedId5 = radioGroup5.getCheckedRadioButtonId();

                int selectedId6 = radioGroup6.getCheckedRadioButtonId();

                int selectedId7 = radioGroup7.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                gender_ = (RadioButton) findViewById(selectedId1);

                smoke_ = (RadioButton) findViewById(selectedId2);

                diabetes_ = (RadioButton) findViewById(selectedId3);

                history_ = (RadioButton) findViewById(selectedId4);

                attack_ = (RadioButton) findViewById(selectedId5);

                murmur_ = (RadioButton) findViewById(selectedId6);

                electro_ = (RadioButton) findViewById(selectedId7);


                String gender = gender_.getText().toString();

                String smoke = smoke_.getText().toString();

                String diabetes = diabetes_.getText().toString();

                String history = history_.getText().toString();

                String attack = attack_.getText().toString();

                String murmur = murmur_.getText().toString();

                String electro = electro_.getText().toString();

                String age = age_.getText().toString();

                String pressure = pressure_.getText().toString();

                int age__ = Integer.parseInt(age);

                int pressure__ = Integer.parseInt(pressure);



                score = 0;
if(age__ > 54 && age__ < 95) {
    if(pressure__ > 89 && pressure__ < 201) {
//age starts here---------->>>>>>>>>>>>>>>>>>>>>>>>>>>
        if (age__ > 54 && age__ < 60) {

            score = score + 0;
        } else if (age__ > 59 && age__ < 63) {

            score = score + 1;
        } else if (age__ > 62 && age__ < 67) {

            score = score + 2;
        } else if (age__ > 66 && age__ < 72) {

            score = score + 3;
        } else if (age__ > 71 && age__ < 75) {

            score = score + 4;
        } else if (age__ > 74 && age__ < 78) {

            score = score + 5;
        } else if (age__ > 77 && age__ < 82) {

            score = score + 6;
            Log.e(TAG, "AGE");
        } else if (age__ > 81 && age__ < 86) {

            score = score + 7;
        } else if (age__ > 85 && age__ < 91) {

            score = score + 8;
        } else if (age__ > 90 && age__ < 94) {

            score = score + 9;
        } else if (age__ > 93) {

            score = score + 10;
        }
//age ends here------------------->>>>>>>>>>>>>>>>>>>>>>>>

//gender start----------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        if (gender.equals("Male")) {
            score = score + 0;
            Log.e(TAG, "Male");
        } else {
            score = score + 6;
            Log.e(TAG, "Female");
        }
//gender end----------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//blood pressure start----------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        if (pressure__ < 120) {
            score = score + 0;
        } else if (pressure__ > 119 && pressure__ < 140) {
            score = score + 1;
        } else if (pressure__ > 139 && pressure__ < 160) {
            score = score + 2;
        } else if (pressure__ > 159 && pressure__ < 180) {
            score = score + 3;
        } else if (pressure__ > 179) {

            score = score + 4;
        }
//blood pressure end----------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//diabetes start------------------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        if (diabetes.equals("Yes")) {
            score = score + 5;
        } else {
            score = score + 0;
        }
//diabetes end------------------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//stroke start------------------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        if (attack.equals("Yes")) {
            score = score + 6;
            Log.e(TAG, "ATTACK");
        } else {
            score = score + 0;
        }

        if (score == 0 || score == 1) {
            Toast.makeText(MainActivity.this, "5% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 2 || score == 3) {
            Toast.makeText(MainActivity.this, "6% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 4) {
            Toast.makeText(MainActivity.this, "7% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 5) {
            Toast.makeText(MainActivity.this, "8% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 6 || score == 7) {
            Toast.makeText(MainActivity.this, "9% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 8) {
            Toast.makeText(MainActivity.this, "11% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 9) {
            Toast.makeText(MainActivity.this, "12% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 10) {
            Toast.makeText(MainActivity.this, "13% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 11) {
            Toast.makeText(MainActivity.this, "14% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 12) {
            Toast.makeText(MainActivity.this, "16% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 13) {
            Toast.makeText(MainActivity.this, "18% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 14) {
            Toast.makeText(MainActivity.this, "19% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 15) {
            Toast.makeText(MainActivity.this, "21% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 16) {
            Toast.makeText(MainActivity.this, "24% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 17) {
            Toast.makeText(MainActivity.this, "26% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 18) {
            Toast.makeText(MainActivity.this, "28% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 19) {
            Toast.makeText(MainActivity.this, "31% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 20) {
            Toast.makeText(MainActivity.this, "34% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 21) {
            Toast.makeText(MainActivity.this, "37% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 22) {
            Toast.makeText(MainActivity.this, "41% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 23) {
            Toast.makeText(MainActivity.this, "44% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 24) {
            Toast.makeText(MainActivity.this, "48% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 25) {
            Toast.makeText(MainActivity.this, "51% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 26) {
            Toast.makeText(MainActivity.this, "55% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 27) {
            Toast.makeText(MainActivity.this, "59% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 28) {
            Toast.makeText(MainActivity.this, "63% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 29) {
            Toast.makeText(MainActivity.this, "67% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 30) {
            Toast.makeText(MainActivity.this, "71% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }

        if (score == 31) {
            Toast.makeText(MainActivity.this, "75% predicted risk of heart stroke or death in 5 years", Toast.LENGTH_SHORT).show();
        }
    }
    else {
        Toast.makeText(MainActivity.this, "The Blood Pressure should be between 90 & 200",Toast.LENGTH_SHORT).show();
    }
}else {
    Toast.makeText(MainActivity.this, "The age should be between 55 & 94",Toast.LENGTH_SHORT).show();
    }

               /* new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, (CharSequence) smok,
                                Toast.LENGTH_SHORT).show();
                    }
                }, 2000);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, (CharSequence) diabete,
                                Toast.LENGTH_SHORT).show();
                    }
                }, 2000);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, (CharSequence) histor,
                                Toast.LENGTH_SHORT).show();
                    }
                }, 2000);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, (CharSequence) attac,
                                Toast.LENGTH_SHORT).show();
                    }
                }, 2000);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, (CharSequence) murmu,
                                Toast.LENGTH_SHORT).show();
                    }
                }, 2000);

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, (CharSequence) electr,
                                Toast.LENGTH_SHORT).show();
                    }
                }, 2000);*/


            }
        });
    }


}
