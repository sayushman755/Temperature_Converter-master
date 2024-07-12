package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cal2 extends AppCompatActivity {
    EditText ed;
    TextView t;
    AppCompatButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal2);



        ed = findViewById(R.id.edttxt);
        t = findViewById(R.id.txtv);
        b1 = findViewById(R.id.calc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }
    public void calculate() {
        String inputText = ed.getText().toString().trim();

        if (inputText.isEmpty()) {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double C = Double.parseDouble(inputText);
            double ans = (C - 32) * 0.55555556;
            String answer = String.format("%.2f", ans);
            t.setText(answer);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input format", Toast.LENGTH_SHORT).show();
        }
    }
}