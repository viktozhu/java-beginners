package com.goit.Lesson4;

import java.util.Scanner;

/**
 * Created by 1 on 02.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a>b){
            a--;
            System.out.println("a>b");
        }
        System.out.println("Now a not bigger then b");

//----------------------------------------------------------------------
        do{
            System.out.println("You can see this, becase do{}while works at least once");
        } while (false);

//----------------------------------------------------------------------
        a=0;
        b=10;
        for (int i=a; i<=b; i++){
            System.out.println("i=" + i);
        }

//----------------------------------------------------------------------
        int times = 0;
        for (int i=0; i<20; i++){
            if (i%2==0) {
                times++;
                System.out.println("i=" + i);
            }
        }

        System.out.println("There are "+times+" even numbers from 0 to 20");

//----------------------------------------------------------------------
        int ar[] = {1,2,3};
        char bar[] = {'a','b','1'};
        boolean boolar[] = {true,true,false};
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
    }


}
