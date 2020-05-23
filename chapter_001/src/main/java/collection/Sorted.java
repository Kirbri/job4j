package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        List<Integer> list2 = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
    }
}

