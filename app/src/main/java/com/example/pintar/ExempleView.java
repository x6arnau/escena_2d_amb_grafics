package com.example.pintar;

import android.content.Context;
import android.graphics.*;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class ExempleView extends View {

    public boolean cercleblau = true;
    Drawable drawableNau;

    // Nau
    GraficNau nau;

    // Ample i alt de la Vista on anem a dibuixar
    public int ampleView = 0;
    public int altView = 0;

    public ExempleView (Context context) {
        super(context);
    }

    public ExempleView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // inicialitza Drawable de Nau
        drawableNau = context.getResources().getDrawable(R.drawable.nau,context.getTheme());
        nau = new GraficNau(this,drawableNau);
    }


    protected void onSizeChanged(int ample, int alt,int ample_anter, int alt_anter) {
        super.onSizeChanged(ample, alt, ample_anter, alt_anter);

        // Obtenim l'ample i l'altçada de la vista amb la que anem a treballar
        this.ampleView = ample;
        this.altView = alt;

        // Ara que sabem la mida de la vista anem a posicionar la Nau
        this.nau.setPosX( this.ampleView / 2);
        this.nau.setPosY( this.altView - 100);

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
        pincel.setStyle(Style.STROKE);
        canvas.drawCircle(100, 100, 50, pincel);

    }

    public void PintaCercleVerd(Canvas canvas) {

        Paint pincel = new Paint();
        pincel.setColor(Color.GREEN);
        pincel.setStrokeWidth(8);
        pincel.setStyle(Style.STROKE);
        canvas.drawCircle(300, 300, 50, pincel);

    }
}
