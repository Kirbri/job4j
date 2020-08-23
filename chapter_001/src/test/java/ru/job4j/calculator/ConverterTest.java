package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = ru.job4j.converter.Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int in = 180;
        int expected = 3;
        int out = ru.job4j.converter.Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}