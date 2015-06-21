package com.goit.Lesson10.geometry;

/**
 * Created by 1 on 12.06.2015.
 */
public class Rectangle extends Figure{
    private int side1, side2;

    public Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSquare() {
        return side1*side2;
    }

    @Override
    public double getPerimeter() {
        return (side1+side2)*2;
    }

}
