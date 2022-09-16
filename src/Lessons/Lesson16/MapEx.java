package Lessons.Lesson16;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Peter", 10);
        myMap.put("Ann", 11);
        myMap.put("Joey", 9);
        myMap.put("Lucy", 13);

        System.out.println("Peter's age is " + myMap.get("Peter"));

        for (Integer i : myMap.values()) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println(myMap.containsKey("PETER"));

        System.out.println(myMap.containsValue(10));

        System.out.println();

        System.out.println("Size: " + myMap.size());
        myMap.remove("Peter");

        System.out.println("Size: " + myMap.size());

        System.out.println();

        for (Map.Entry<String, Integer> i : myMap.entrySet()) {
            System.out.println(i.getKey() + "-" + i.getValue());
        }

    }
}
