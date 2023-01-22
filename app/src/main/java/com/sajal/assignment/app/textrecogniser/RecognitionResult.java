package com.sajal.assignment.app.textrecogniser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecognitionResult extends AppCompatActivity {
    TextView tvExtractText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recognition_result);
        tvExtractText = findViewById(R.id.tvExtractText);
        Intent i = getIntent();
        String str = getIntent().getExtras().getString("extractText");
        tvExtractText.setText(str);

    }
}