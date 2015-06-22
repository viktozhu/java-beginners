package com.goit.Lesson14.test;

import com.goit.Lesson13.MathFuntions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/**
 * Created by 1 on 22.06.2015.
 */
@RunWith(value = Parameterized.class)
public class MathUtilsTest {
    private int numberA;
    private int numberB;
    private int expected;

    //parameters pass via this constructor
    public MathUtilsTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    //Declares parameters here
    @Parameterized.Parameters(name = "{index}: add({0}+{1})={2}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {2, 2, 4},
                {8, 2, 16},
                {4, 5, 20}
        });
    }

    @Test
    public void test_add() {
        Assert.assertEquals(expected, MathFuntions.mupliply(numberA, numberB));
    }
}
