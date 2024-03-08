package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class MyDraw extends View {

    Paint p;

    public MyDraw(Context context) {
        super(context);
        p = new Paint();
        p.setColor(Color.RED);
        p.setStrokeWidth(6);
        p.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        drawCircle(canvas, getWidth()/2,getHeight()/2,250);
    }

    public void drawCircle(Canvas c, int x, int y,int r) {
        c.drawCircle(x,y,r,p);
        if(r > 20) {
            drawCircle(c,x,y-r,r/2);
            drawCircle(c,x+r,y,r/2);
            drawCircle(c,x,y+r,r/2);
            drawCircle(c,x-r,y,r/2);
        }

    }
}
