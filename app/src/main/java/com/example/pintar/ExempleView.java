package com.example.pintar;



import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

public class ExempleView extends View {

    public boolean cercleblau = true;
    Drawable drawableNau;

    // Nau
    GraficNau nau;

    public ExempleView (Context context) {
        super(context);
    }

    public ExempleView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Inicialitza Drawable de la nau
        drawableNau = context.getResources().getDrawable(R.drawable.nau, context.getTheme());
        nau = new GraficNau(this, drawableNau);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Dibuixar aquí
        if(cercleblau) PintaCercleBlau(canvas);
        else  PintaCercleVerd(canvas);

        this.nau.dibuixaGrafic(canvas);
    }
    public void PintaCercleBlau(Canvas canvas) {

        Paint pincel = new Paint();
        pincel.setColor(Color.BLUE);
        pincel.setStrokeWidth(8);
        pincel.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(100, 100, 50, pincel);

    }

    public void PintaCercleVerd(Canvas canvas) {

        Paint pincel = new Paint();
        pincel.setColor(Color.GREEN);
        pincel.setStrokeWidth(8);
        pincel.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300, 300, 50, pincel);

    }
}
