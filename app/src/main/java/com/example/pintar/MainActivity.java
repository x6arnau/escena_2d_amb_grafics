package com.example.pintar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button b;
    ExempleView vistaExemple;
    /** Called when the activity is first created. */
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