package com.example.pintar;

import android.graphics.Canvas;

public class Circle extends Shape{
    float rd;

    public Circle(float rd) {
        this.rd  = rd;
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(getX(),getY(),rd,getStyle());
    }
}
