package com.goit.Lesson10.geometry;

/**
 * Created by 1 on 12.06.2015.
 */
public class Pixel {
    private int x;
    private int y;

    public Pixel(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinates(){
        int[] res = {x,y};
        return res;
    }
}
