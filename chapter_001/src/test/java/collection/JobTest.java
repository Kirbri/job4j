package collection;

import org.junit.Test;
import ru.job4j.collection.*;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenCompatorByNameAndProrityDecreaseOneName() {
        Comparator<Job> cmpNamePriorityDecrease = new JobDescByNameDecrease().thenComparing(new JobDescByPriorityDecrease());
        int rsl = cmpNamePriorityDecrease.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(2));
    }

    @Test
    public void whenCompatorByNameAndProrityDecreaseOnePriority() {
        Comparator<Job> cmpPriorityNameDecrease = new JobDescByPriorityDecrease().thenComparing(new JobDescByNameDecrease());
        int rsl = cmpPriorityNameDecrease.compare(
                new Job("Impl task", 8),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(8));
    }

    @Test
    public void whenCompatorByNameAndProrityIncreaseOneName() {
        Comparator<Job> cmpNamePriorityIncrease = new JobDescByNameIncrease().thenComparing(new JobDescByPriorityIncrease());
        int rsl = cmpNamePriorityIncrease.compare(
                new Job("Impl task", 3),
                new Job("Fix bug", 3)
        );
        assertThat(rsl, lessThan(5));
    }

    @Test
    public void whenCompatorByNameAndProrityIncreaseOnePriority() {
        Comparator<Job> cmpPriorityNameIncrease = new JobDescByPriorityIncrease().thenComparing(new JobDescByNameIncrease());
        int rsl = cmpPriorityNameIncrease.compare(
                new Job("Impl task", 3),
                new Job("Fix bug", 4)
        );
        assertThat(rsl, lessThan(8));
    }

    @Test
    public void whenCompatorByNameIncrease() {
        Comparator<Job> cmpNameIncrease = new JobDescByNameIncrease();
        int rsl = cmpNameIncrease.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(4));
    }

    @Test
    public void whenCompatorPriorityIncrease() {
        Comparator<Job> cmpPriorityIncrease = new JobDescByPriorityIncrease();
        int rsl = cmpPriorityIncrease.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorPriorityDecrease() {
        Comparator<Job> cmpPriorityDecrease = new JobDescByPriorityDecrease();
        int rsl = cmpPriorityDecrease.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(2));
    }

    @Test
    public void whenCompatorByNameDecrease() {
        Comparator<Job> cmpNameDecrease = new JobDescByNameDecrease();
        int rsl = cmpNameDecrease.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(1));
    }
}
