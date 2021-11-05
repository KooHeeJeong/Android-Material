package com.kooproject.material;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public class Menu_ProgressIndicators extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_indicators);

        Button btn_ramdom = (Button) findViewById(R.id.btn_ramdom);
        Button btn_25 = (Button) findViewById(R.id.btn_25);
        Button btn_50 = (Button) findViewById(R.id.btn_50);
        Button btn_75 = (Button) findViewById(R.id.btn_75);

        final LinearProgressIndicator progress1 = (LinearProgressIndicator) findViewById(R.id.progress_bar);
        final CircularProgressIndicator progress2 = (CircularProgressIndicator) findViewById(R.id.progress_cir);
        progress1.setIndeterminate(true);
        progress2.setIndeterminate(true);


        //RAMDOM Button Click Event
        btn_ramdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1.setVisibility(View.INVISIBLE);
                progress1.setIndeterminate(true);
                progress1.setVisibility(View.VISIBLE);

                progress2.setVisibility(View.INVISIBLE);
                progress2.setIndeterminate(true);
                progress2.setVisibility(View.VISIBLE);

            }
        });

        //25% Button Click Event
        btn_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1.setProgressCompat(25, true);
                progress2.setProgressCompat(25, true);
            }
        });

        //50% Button Click Event
        btn_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1.setProgressCompat(50, true);
                progress2.setProgressCompat(50, true);
            }
        });

        //75% Button Click Event
        btn_75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1.setProgressCompat(75, true);
                progress2.setProgressCompat(75, true);
            }
        });
    }
}
