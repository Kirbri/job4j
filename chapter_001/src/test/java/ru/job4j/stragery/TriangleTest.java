package ru.job4j.stragery;

import org.junit.Test;
import ru.job4j.stragery.Triangle;

import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ann Kornilova (kanna1997@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("  +  ")
                                .add(" +++ ")
                                .add("+++++")
                                .add(System.lineSeparator())
                                .toString()
                )
        );
    }

}
