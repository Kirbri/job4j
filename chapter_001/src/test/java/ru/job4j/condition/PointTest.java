package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class PointTest {
    @Test
    public void distance(){
        int x1=0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected =2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance1(){
        int x1 = 5;
        int y1= 7;
        int x2=14;
        int y2 =21;
        double expected = 16.64;
        double out = Point.distance(x1,y1,x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}
