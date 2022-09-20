package Lessons.lesson17.CollectionsMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequency {
    public static void main(String[] args) {
        List<Integer> list4 = Arrays.asList(1, 2, 2, 3, 4, 4, 3);
        System.out.println(list4);
        System.out.println("Frequency of 1 " + Collections.frequency(list4, 1));
        System.out.println("Frequency of 2 " + Collections.frequency(list4, 2));
        System.out.println("Frequency of 3 " + Collections.frequency(list4, 3));
        System.out.println("Frequency of 4 " + Collections.frequency(list4, 4));
    }
}
