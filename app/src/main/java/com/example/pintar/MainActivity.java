package com.example.pintar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;
    ExempleView vistaExemple;
    /** Called when the activity is first created. */
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Vista amb Layout
        setContentView(R.layout.activity_main);

        // Vista directament de la classe
        //setContentView(new ExempleView(this));

        vistaExemple = (ExempleView) this.findViewById(R.id.exview);
        b = (Button) findViewById(R.id.bt_change);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                if (vistaExemple.cercleblau) {
                    vistaExemple.cercleblau=false;
                    vistaExemple.nau.setPosX(50);
                } else {
                    vistaExemple.cercleblau=true;
                    vistaExemple.nau.setPosX(350);
                }
                vistaExemple.postInvalidate();
            }
        });
    }
}