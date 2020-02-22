package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas76Then6(){
        FindLoop find = new FindLoop();
        int[] input = new int[]{3, 0, 23, 234, 94, 87, 76};
        int value = 76;
        int result = find.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayNotHas94(){
        FindLoop find = new FindLoop();
        int[] input = new int[] {3,6,2,3,63,24,6,2334,90};
        int value =94;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
