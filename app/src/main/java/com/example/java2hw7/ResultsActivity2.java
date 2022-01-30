package com.example.java2hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Java2hw7);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);
        TextView tvResult = findViewById(R.id.tv_history);
        if (getIntent() != null) {
            tvResult.setText(getIntent().getStringExtra("results"));
        }
        findViewById(R.id.btn_crash_app).setOnClickListener(view -> {
//            android.os.Process.killProcess(android.os.Process.myPid());
            startActivity(
                    new Intent(Intent.ACTION_MAIN)
                            .addCategory(Intent.CATEGORY_HOME)
                            .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            );
        });
    }
}