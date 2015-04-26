package com.goit.Lesson2;

/**
 * Created by 1 on 23.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        boolean bool = true;

        char c = 'a';

        float f = 3.4028235E+38f;
        double d = 1.7976931348623157E+308d;

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;

        //correct conversion
        //64>32>16>8
        l=i=s=b;
        //64>32
        d=f;
        System.out.println("When we do correct assignment long=" + l);
        System.out.println("When we do correct assignment int="+i);
        System.out.println("When we do correct assignment short="+s);
        System.out.println("When we do correct assignment byte="+b);
        System.out.println("When we do correct assignment double="+d);
        System.out.println("When we do correct assignment float="+f);


//----------------------------------------------------------------------------------------------------------
        System.out.println();
        //FIXME: incorrect conversion
        l = 9223372036854775807L;
        int il=(int)l;
        short si=(short)2147483647;
        byte bs=(byte)32767;

        d = 1.7976931348623157E+308d;
        float fd=(float)d;

        System.out.println("When we do invalid assignment long=" + l);
        System.out.println("When we do invalid assignment int="+il);
        System.out.println("When we do invalid assignment short="+si);
        System.out.println("When we do invalid assignment byte="+bs);
        System.out.println("When we do invalid assignment double="+d);
        System.out.println("When we do invalid assignment float="+fd);


//----------------------------------------------------------------------------------------------------------
        System.out.println();
        d = 1.7976931348623157E+308d;
        i = (int)d - 100;
        System.out.println("i="+i);
    }
}
