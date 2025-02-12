package com.example.pintar;

public class ShapeFactory {
    public ShapeFactory(){}

    public Shape getCircle(float rd){
        return new Circle(rd);
    }

    public Shape getRectangle(float x, float y){
        return new Rectangle(x,y);
    }

    public Shape getText(String text){
        return new Text(text);
    }
}
