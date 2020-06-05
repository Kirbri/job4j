package array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() {
        int[] input = new int[] {9, 1, 45, 2, 67, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 9, 45, 67};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() {
        int[] input = new int[] {90, 3, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 90};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort4() {
        int[] input = new int[] {90, 86, 34};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {34, 86, 90};
        assertThat(result, is(expect));
    }
}
