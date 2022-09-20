package Lessons.lesson17.CollectionsMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("List " + list3);
        System.out.println(Collections.min(list3));
        System.out.println(Collections.max(list3));
    }
}
