package ru.job4j.stragery;

import java.util.StringJoiner;

/**
 * @author Ann Kornilova (kanna1997@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("  +  ");
        pic.add(" +++ ");
        pic.add("+++++");
        pic.add(System.lineSeparator());
        return pic.toString();
    }
}
