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
        String[] sArr = str.split(",");
        int[] iArr = new int[sArr.length]; //what other length could be?
        for (int i=0; i<sArr.length; i++)
            iArr[i] = Integer.valueOf(sArr[i]);

        System.out.println(Arrays.toString(iArr));

        // String builder
        String palindrome = "moom";
        StringBuilder sb  = new StringBuilder(palindrome);
        sb = sb.reverse();
        System.out.println(palindrome.equals(sb.toString()));

        sb = sb.append("new ending");
        sb = sb.delete(1, 2);
        sb = sb.insert(2, "some sub string");
        sb = sb.replace(2,3,"replace this part");
        sb.toString();

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
