package com.example.pintar;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape {
    private int x,y;
    private Paint style;

    public Shape(){

    }

    public abstract void onDraw(Canvas canvas);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Paint getStyle() {
        return style;
    }

    public void setStyle(Paint style) {
        this.style = style;
    }
}
