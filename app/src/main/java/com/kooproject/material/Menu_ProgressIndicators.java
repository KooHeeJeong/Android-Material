package com.kooproject.material;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class Menu_ProgressIndicators extends AppCompatActivity {
    int percent = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_indicators);

        Button btn_25 = (Button) findViewById(R.id.btn_25);
        Button btn_50 = (Button) findViewById(R.id.btn_50);
        Button btn_75 = (Button) findViewById(R.id.btn_75);

        final LinearProgressIndicator progress1 = (LinearProgressIndicator) findViewById(R.id.progress_bar);
        progress1.setIndeterminate(true);

        btn_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percent = 25;
                progress1.setIndeterminate(false);
                progress1.setProgressCompat(percent, true);
            }
        });

        btn_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percent = 50;
                progress1.setProgressCompat(percent,true);
            }
        });

        btn_75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percent = 75;
                progress1.setProgressCompat(percent,true);
            }
        });
    }
}
