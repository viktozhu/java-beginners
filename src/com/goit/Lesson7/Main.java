package com.goit.Lesson7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 1 on 13.05.2015.
 */
public class Main {

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset); // 26 - limitation of number of latin letters
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String [] args) {
        System.out.println("Input array using comma delimiter");
        Scanner scanner  =new Scanner(System.in);
        String str = scanner.nextLine();
        String[] sArray = str.split(",");
        int[] iArray = new int[sArray.length]; //what other length could be?
        for (int i=0; i<sArray.length; i++)
            iArray[i] = Integer.valueOf(sArray[i]);

        System.out.println(Arrays.toString(iArray));

        // String builder
        String palindrome = "moom";
        StringBuilder builder  = new StringBuilder(palindrome);
        builder = builder.reverse();
        System.out.println(palindrome.equals(builder.toString()));

        builder = builder.append("new ending");
        builder = builder.delete(1, 2);
        builder = builder.insert(2, "some sub string");
        builder = builder.replace(2,3,"replace this part");
        builder.toString();

        //Caesar algorithm
        System.out.println("Enter string to be ciphered");
        String clearText = scanner.nextLine();
        System.out.println("Enter shift number");
        int shift = scanner.nextInt();
        String cipheredText = encode(clearText,shift);
        System.out.println(cipheredText);
        System.out.println(decode(cipheredText,shift));
    }
}
