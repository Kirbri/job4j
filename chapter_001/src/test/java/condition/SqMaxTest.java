package condition;

import condition.SqMax;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void when6475() {
        int first = 6;
        int second = 4;
        int third = 7;
        int forth = 5;
        int expected = 7;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when1234() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int expected = 4;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when9876() {
        int first = 9;
        int second = 8;
        int third = 7;
        int forth = 6;
        int expected = 9;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when7823() {
        int first = 7;
        int second = 8;
        int third = 2;
        int forth = 3;
        int expected = 8;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

    @Test
    public void when6666() {
        int first = 6;
        int second = 6;
        int third = 6;
        int forth = 6;
        int expected = 6;
        int s = SqMax.max(first, second, third, forth);
        assertThat(s, is(expected));
    }

}
