package Lessons.lesson17.CollectionsMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSortEx {


    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red", "green", "blue");
        System.out.println("List " + list1);
        Collections.sort(list1);
        System.out.println(list1);
    }

}
