package com.goit.Lesson13.tests;

import com.goit.Lesson13.MathFuntions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Viktor on 21.06.2015.
 */
public class FirstTest {
    @Test
    public void multiplyTest(){
        int a = 1;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult,MathFuntions.mupliply(a, b));
    }
}
