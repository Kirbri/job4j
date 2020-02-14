package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight(){
        int in = 100;
        double expected = 0;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight(){
        int in = 200;
        double expected =103.49;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void manWeight1(){
        int in = 195;
        double expected = 109.25;
        double out =Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
