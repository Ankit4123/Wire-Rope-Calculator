package com.example.myapplicationtry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    double a;
    private EditText mEditText1;
    private TextView mTextViewresult;
    private Button mButtomAdd;
    private EditText mEditText2;
    private  EditText mEditText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinnermm);

        String [] diameter={"Select One ","9 mm","10 mm","11 mm","12 mm","13 mm","14 mm","15 mm","16 mm","17 mm","18 mm","19 mm","20 mm","21 mm","22 mm","23 mm","24 mm","25 mm","26 mm","27 mm","28 mm","29 mm","30 mm","31 mm","32 mm","33 mm","34 mm","35 mm","36 mm","37 mm","38 mm","39 mm","40 mm","41 mm","42 mm","43 mm","44 mm","46 mm","48 mm","50 mm","52 mm",};

        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,diameter);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        a = 0.339;
                        break;
                    case 2:
                        a = 0.418;
                        break;
                    case 3:
                        a = 0.508;
                        break;
                    case 4:
                        a = 0.602;
                        break;
                    case 5:
                        a = 0.707;
                        break;
                    case 6:
                        a = 0.820;
                        break;
                    case 7:
                        a = 0.940;
                        break;
                    case 8:
                        a = 1.070;
                        break;
                    case 9:
                        a = 1.210;
                        break;
                    case 10:
                        a = 1.350;
                        break;
                    case 11:
                        a = 1.510;
                        break;
                    case 12:
                        a = 1.670;
                        break;
                    case 13:
                        a = 1.850;
                        break;
                    case 14:
                        a = 2.020;
                        break;
                    case 15:
                        a = 2.210;
                        break;
                    case 16:
                        a = 2.410;
                        break;
                    case 17:
                        a = 2.620;
                        break;
                    case 18:
                        a = 2.830;
                        break;
                    case 19:
                        a = 3.030;
                        break;
                    case 20:
                        a = 3.280;
                        break;
                    case 21:
                        a = 3.530;
                        break;
                    case 22:
                        a = 3.760;
                        break;
                    case 23:
                        a = 4.010;
                        break;
                    case 24:
                        a = 4.280;
                        break;
                    case 25:
                        a = 4.550;
                        break;
                    case 26:
                        a = 4.840;
                        break;
                    case 27:
                        a = 5.130;
                        break;
                    case 28:
                        a = 5.420;
                        break;
                    case 29:
                        a = 5.730;
                        break;
                    case 30:
                        a = 6.040;
                        break;
                    case 31:
                        a = 6.360;
                        break;
                    case 32:
                        a = 6.690;
                        break;
                    case 33:
                        a = 7.030;
                        break;
                    case 34:
                        a = 7.380;
                        break;
                    case 35:
                        a = 7.730;
                        break;
                    case 36:
                        a = 8.160;
                        break;
                    case 37:
                        a = 8.850;
                        break;
                    case 38:
                        a = 9.640;
                        break;
                    case 39:
                        a = 10.400;
                        break;
                    case 40:
                        a = 11.310;
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        mEditText1 = findViewById(R.id.editTextNumberDecimalMtr);
        mEditText2 = findViewById(R.id.editTextNumberDecimal2Kg);
        mEditText3 = findViewById(R.id.editTextNumberDecimal3Amt);
        mTextViewresult = findViewById(R.id.textView5Res);
        mButtomAdd = findViewById(R.id.button);

        mButtomAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }
                if(mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }
                if(mEditText3.getText().toString().length() == 0) {
                    mEditText3.setText("0");
                }

                double mtr = Double.parseDouble(mEditText1.getText().toString());
                double mm = Double.parseDouble(String.valueOf(a));
                double kg = Double.parseDouble(mEditText2.getText().toString());
                double amt = Double.parseDouble(mEditText3.getText().toString());

                double sum = (mm * mtr * kg) + amt;
                mTextViewresult.setText(String.valueOf(sum));

            }
        });
    }
}