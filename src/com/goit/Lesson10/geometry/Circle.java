package com.goit.Lesson10.geometry;

/**
 * Created by 1 on 12.06.2015.
 */
public class Circle extends Figure {
    private int x1,x2,radius;

    public Circle(int x1, int x2, int radius){
        this.x1 = x1;
        this.x2 = x2;
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
