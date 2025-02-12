package com.example.pintar;



import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

public class ExempleView extends View {

    private List<Shape> shapes;
    ShapeFactory shapeFactory;

    public ExempleView (Context context) {
        super(context);
        shapes = new ArrayList<>();
        shapeFactory = new ShapeFactory();
    }

    public ExempleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        shapes = new ArrayList<>();
        shapeFactory = new ShapeFactory();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(Shape sh : shapes){
            sh.onDraw(canvas);
        }
    }

    public void generaShapes(){

        Shape sh1 = shapeFactory.getCircle(54);
        sh1.setX(100);
        sh1.setY(200);
        sh1.setStyle(createStyleBlue());
        shapes.add(sh1);

        Shape sh2 = shapeFactory.getRectangle(300,300);
        sh2.setX(600);
        sh2.setY(600);
        sh2.setStyle(createStyleBlue());
        shapes.add(sh2);

        Shape sh3 = shapeFactory.getText("Hola");
        sh3.setX(100);
        sh3.setY(300);
        sh3.setStyle(createStyleBlue());
        shapes.add(sh3);


    }

    private Paint createStyleBlue(){
        Paint pincel = new Paint();
        pincel.setColor(Color.BLUE);
        pincel.setStrokeWidth(20);
        pincel.setStyle(Paint.Style.STROKE);
        pincel.setTextSize(100);

        return pincel;
    }

}
