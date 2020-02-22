package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to4(){
        int[] input = {1,3,4,6,1,45};
        int[] expect = {1,3,1,6,4,45};
        int[] rsl = SwitchArray.swap(input, 2,4);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to5(){
        int[] input = {1,3,4,9,7,45};
        int[] expect = {1,45,4,9,7,3};
        int[] rsl = SwitchArray.swap(input, 1,5);
        assertThat(rsl, is(expect));
    }
}
