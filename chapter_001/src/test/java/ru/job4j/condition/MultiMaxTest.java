package ru.job4j.condition;

//import com.google.common.collect.MultimapBuilder;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 5, 8);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(11, 15, 0);
        assertThat(result, is(15));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(17, 30, 60);
        assertThat(result, is(60));
    }

    @Test
    public void whenSame() {
        MultiMax check = new MultiMax();
        int result = check.max(100, 100, 100);
        assertThat(result, is(100));

    }
}
