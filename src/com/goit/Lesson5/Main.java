package com.goit.Lesson5;

import java.util.Arrays;

/**
 * Created by 1 on 04.05.2015.
 */
public class Main {
    public static final int SIZE = 256;

    public static void main(String[] args){
        int[] iArray1 = new int[5];
        int iArray2[] = new int[5];

        long[] lArray = new long[SIZE];

        double[] dArray = {1.2,2.2,3.5};
        boolean[] bArray = new boolean[]{true,true,false};

// examples
        float[] fArray = {(float) 1.0, (float) 2.0, (float) 3.0}; // because by default in java long and double (64bit)
        fArray[0] = 0;
        fArray[2] = fArray[1]+fArray[2];



//print array
        System.out.println(fArray); //show array address in memory

        for (int i=0; i<fArray.length; i++){
            System.out.print(fArray[i] + " ");
        }
        System.out.println();

//sort array
        int sortArray[] = {5,3,2,1,4};
        for (int i=0; i<sortArray.length; i++)
            for (int j=i; j<sortArray.length; j++)
                if (sortArray[i]>sortArray[j]){
                    int temp = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = temp;
                }

        System.out.println("Sorted array:");
        for (int i=0; i<sortArray.length; i++){
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();

//Arrays
        int someArray[] = {1,5,7,2,0};
        Arrays.sort(someArray);
        System.out.println("Sorted array:" + Arrays.toString(someArray));

//Char array
        char[] cArray = new char[SIZE];
        for (int i=0; i<cArray.length; i++){
            cArray[i] = (char) i;
        }

        System.out.println("Char array:\n" + Arrays.toString(cArray));
    }
}
