package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax10To5Then10() {
        int result = Max.max(10, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax20To100Then100() {
        int result = Max.max(20, 100);
        assertThat(result, is(100));
    }

    @Test
    public void whenMax50To50Then50() {
        int result = Max.max(50, 50);
        assertThat(result, is(50));
    }

    @Test
    public void whenMax40To50To20Then50() {
        int result = Max.max(40, 50, 20);
        assertThat(result, is(50));
    }

    @Test
    public void whenMax4To7To1To9Then9() {
        int result = Max.max(4, 7, 1, 9);
        assertThat(result, is(9));
    }

}