package com.example.pintar;

import android.graphics.Canvas;

public class Rectangle extends Shape {

    private float x2;
    private float y2;

    public Rectangle(float x,float y){
        this.x2 = x;
        this.y2 = y;
    }
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(x2,y2,getX(),getY(),getStyle());
    }
}
