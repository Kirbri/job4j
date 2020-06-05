package loop;

import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int res = Factorial.calc(5);
        int expected = 120;
        assertThat(res, is(expected)); //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int res = Factorial.calc(0);
        int expected = 1;
        assertThat(res, is(expected)); //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}
