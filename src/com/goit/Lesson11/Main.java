package com.goit.Lesson11;

/**
 * Created by 1 on 06.06.2015.
 */
public class Main {
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args){
        int num = 5;
        System.out.println(factorial(num));
    }
}
