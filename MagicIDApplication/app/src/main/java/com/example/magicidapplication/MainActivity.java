package com.example.magicidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btnSubmit;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.etID);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults= findViewById(R.id.tvResults);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idNumber= etID.getText().toString().trim();

                String dob= idNumber.substring(0, 6);

                int gender= Integer.parseInt(Character.toString(idNumber.charAt(6)));

                String sGender;

                if (gender < 5)
                    sGender= getString(R.string.female);
                else
                    sGender= getString(R.string.male);

                int nationality= Integer.parseInt(Character.toString(idNumber.charAt(10)));

                String sNationality;
                if (nationality== 0)
                    sNationality= getString(R.string.sa_citizen);
                else
                    sNationality=getString(R.string.permanent_resident);

                String text= getString(R.string.dob) + dob+ getString(R.string.newline) +
                        getString(R.string.gender) + sGender + getString(R.string.newline) +
                        getString(R.string.nationality) + sNationality;

                tvResults.setText(text);


            }
        });
    }
}