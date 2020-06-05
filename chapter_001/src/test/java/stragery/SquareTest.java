package stragery;

import org.junit.Test;
import ru.job4j.stragery.Square;

import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ann Kornilova (kanna1997@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+     +")
                                .add("+     +")
                                .add("++++")
                                .add(System.lineSeparator())
                                .toString()
                )
        );
    }
}
