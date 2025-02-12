package com.example.pintar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;
    ExempleView vistaExemple;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Vista amb Layout
        setContentView(R.layout.activity_main);

        //Pinto
        vistaExemple = (ExempleView) this.findViewById(R.id.exview);
        vistaExemple.generaShapes();
        vistaExemple.postInvalidate();


    }
}