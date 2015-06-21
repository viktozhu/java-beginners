package com.goit.Lesson3;

import java.util.Scanner;

/**
 * Created by 1 on 26.04.2015.
 */
public class Main {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.print("Enter radius and pi: ");
        // based on system configuration enter 3.14 or 3,14

        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = scanner.nextDouble();

        double area = pi*r*r;
        System.out.print("Area of circle is ");
        System.out.println(area);

        double r1 = 5;
        double r2 = 10;
        double area1 = r1*r1*PI;
        double area2 = r2*r2*PI;

        if (area1>area2)
            System.out.println("Area1 is bigger ");
        else
            System.out.println("Area2 is bigger ");

        if ((r1>r2) || (area1>area2))
            System.out.println("Area1 is bigger ");
        else
            System.out.println("Area2 is bigger ");


    // triangle sides
        double a = 3;
        double b = 4;
        double c = 5;

        if (c*c == a*a+b*b)
            System.out.println("Pythagoras was right");
    }
}
