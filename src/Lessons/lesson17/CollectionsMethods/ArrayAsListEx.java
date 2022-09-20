package Lessons.lesson17.CollectionsMethods;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

    public static void main(String[] args) {
        String[] a = {"foo", "bar", "buz"};

        List<String> list = Arrays.asList(a);
        System.out.println(list);//foo bar baz

        a[0] = "aaa";
        System.out.println(list);// aaa bar baz
    }
}
