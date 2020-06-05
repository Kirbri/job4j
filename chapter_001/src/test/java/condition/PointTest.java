package condition;

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

    @Test
    public void distance2() {
        Point a = new Point(1, 1);
        Point b = new Point(-2, 4);
        double expected = 4.24;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        Point a = new Point(1, 1);
        Point b = new Point(-2, 4);
        double expected = 4.24;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        Point a = new Point(0, 0, 3);
        Point b = new Point(0, 2, 4);
        double expected = 2.23;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance5() {
        Point a = new Point(12, 4, 7);
        Point b = new Point(23, 5, 3);
        double expected = 11.74;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
