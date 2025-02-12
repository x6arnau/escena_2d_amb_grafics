package com.example.pintar;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

public class GraficNau {
    private Drawable drawable;
    private View view;

    private int ampleImg, altImg; //Imatge que dibuixarem
    private double posX, posY; //Posició de la nau al Layout (vista)

    //Constructor
    public GraficNau(View view, Drawable drawable) {
        this.view = view;
        this.drawable = drawable;

        //Agafem l'ample i l'alt de la imatge
        ampleImg = drawable.getIntrinsicWidth();
        altImg = drawable.getIntrinsicHeight();

        //Posició de la nau a la vista inicial
        this.posX = this.ampleImg + 5;
        this.posY = this.altImg + 5;
    }

    //Mètode per dibuixar la nau
    public void dibuixaGrafic(Canvas canvas) {
        //definim el rectangle on posicionrem la nau
        //obligatori definir setBounds
        drawable.setBounds((int)posX, (int)posY, (int)posX + ampleImg, (int)posY + altImg);

    }

    //Getters i Setters
    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }
}
