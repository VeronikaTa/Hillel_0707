package Lessons.lesson17.CollectionsMethods.Shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "green", "blue", "yellow");
        System.out.println("Before shuffling: " + list);
        Collections.shuffle(list);
        System.out.println("After shuffling " + list);
    }
}
