package Lessons.Lesson16;

import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("D");
        set.add("A");
        set.add("D");
        set.add("C");
        set.add("B");

        System.out.println(set);
    }
}
