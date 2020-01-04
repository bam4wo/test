package com.bam.tryy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private static final float DEFAULT_FEE = -1;
    private TextView fees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        float fee = intent.getFloatExtra("FEE",DEFAULT_FEE);
        fees = findViewById(R.id.fees);
        fees.setText(fee+"");

    }
}
