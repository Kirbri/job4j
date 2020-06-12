package ru.job4j.condition;

import condition.Triangle;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TriangleTest {
    @Test
    public void whenNine() {
        Triangle triangle = new Triangle(new ru.job4j.condition.Point(1, 1), new ru.job4j.condition.Point(-2, 4), new ru.job4j.condition.Point(-2, -2));
        double out = triangle.area();
        double expected = 8.9;
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenMinusOne() {
        Triangle triangle = new Triangle(new ru.job4j.condition.Point(1, 1), new ru.job4j.condition.Point(0, 0), new ru.job4j.condition.Point(0, 0));
        double out = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, out, 0.1);
    }
}
