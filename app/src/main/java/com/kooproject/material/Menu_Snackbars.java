package com.kooproject.material;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Menu_Snackbars extends AppCompatActivity {
    private Button btn_toast, btn_snack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbars);
        btn_toast = (Button) findViewById(R.id.btn_toast);
        btn_snack = (Button) findViewById(R.id.btn_snack);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Menu_Snackbars.this, "Toast메세지", Toast.LENGTH_SHORT).show();
                //GIT CHECKING
            }
        });

        btn_snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Snackbar snackbar = Snackbar.make(view, "SnackBars", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("dismiss", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                })
                        .setTextColor(Color.parseColor("#FEDBD0"))
                        .setActionTextColor(Color.parseColor("#FEDBD0"))
                        .setBackgroundTint(Color.parseColor("#442C2E"))
                        .show();
            }
        });
    }
}
