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
    public void whenMax10To5Then10(){
        int result = Max.max(10, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax20To100Then100(){
        int result = Max.max(20, 100);
        assertThat(result, is(100));
    }

    @Test
    public void whenMax50To50Then50(){
        int result = Max.max(50, 50);
        assertThat(result, is(50));
    }

}