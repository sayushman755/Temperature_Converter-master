package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class calculation_d2f extends AppCompatActivity {
    EditText edt;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_d2f);

        edt = findViewById(R.id.et);
        t1 = findViewById(R.id.tv);
        b1 = findViewById(R.id.cal);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }

    public void calculate() {
        String inputText = edt.getText().toString().trim();

        if (inputText.isEmpty()) {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double C = Double.parseDouble(inputText);
            double ans = (C * 1.8) + 32;
            String answer = String.format("%.2f", ans);
            t1.setText(answer);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input format", Toast.LENGTH_SHORT).show();
        }
    }
}
