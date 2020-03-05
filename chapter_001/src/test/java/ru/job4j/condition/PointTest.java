package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance1() {
        Point a = new Point(5, 7);
        Point b = new Point(14, 21);
        double expected = 16.64;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}
