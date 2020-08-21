package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etTemp;
    Button btnSubmit;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTemp= findViewById(R.id.etTemp);
        btnSubmit= findViewById(R.id.btSubmit);
        tvResults= findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int chirps=Integer.parseInt(etTemp.getText().toString().trim());
                double temp=(chirps /3.0) +4;

                String text="The approximate temperature outside is "+temp+" Degrees Celcius.";
                tvResults.setText(text);

                tvResults.setVisibility(View.VISIBLE);
            }
        });
    }
}