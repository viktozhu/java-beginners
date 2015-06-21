package com.goit.Lesson6;

import java.awt.geom.Ellipse2D;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 1 on 05.05.2015.
 */
public class Main {
    public static void main(String [] args) {
        String str = "Hello String";
        System.out.println(str);

        str = "";
        char[] arr = {'a','b','c','d'};
        for (int i=0; i<arr.length; i++){
            str += arr[i];
        }
        System.out.println(str);

        str = arr.toString();
        System.out.println(str);

        str = Arrays.toString(arr);
        System.out.println(str);

// convert other types to String

        double d = 1000.0002;
        str = String.valueOf(d);

        float f = 10;
        f = Float.valueOf(str);

// operations with String. Concatenation
        String firstStr = "first string";
        String secondStr = " and second string";

        firstStr += secondStr;
        System.out.println("Concat string example: " + firstStr);

        firstStr = "1";
        secondStr = " and 2";
        firstStr = firstStr.concat(secondStr);
        System.out.println("Another concat string example: " + firstStr);

        firstStr = "1";
        secondStr = "1";
        if (firstStr.equals(secondStr)){
            System.out.println("Strings are equals");
        }

        firstStr = "ac";
        secondStr = "ab";
        System.out.println(firstStr.compareTo(secondStr));

        firstStr = "a";
        secondStr = "A";
        System.out.println(firstStr.compareTo(secondStr));

//Palindrome
        String pal = "moom";
        char c[] = pal.toCharArray();
        boolean ok = true;
        for (int i=0; i<c.length/2; i++){
            ok = ok && (c[i]==c[c.length-i-1]);
        }

        if (ok)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
