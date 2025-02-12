package com.example.pintar;

import android.graphics.Canvas;

public class Text extends Shape{
    private String text;

    public Text(String text){
        this.text = text;
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawText(text,getX(),getY(),getStyle());
    }
}
