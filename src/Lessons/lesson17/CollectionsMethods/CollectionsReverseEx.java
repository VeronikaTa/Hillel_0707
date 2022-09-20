package Lessons.lesson17.CollectionsMethods;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "green", "blue");
        System.out.println("Before sorting" + list);
        Collections.reverse(list);
        System.out.println("After reverse sorting " + list);
    }
}
