package Lessons.Lesson16;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        for (Integer i : mySet) {
            System.out.println(i);
        }
        mySet.remove(1);

        for (Integer i : mySet) {
            System.out.println("After remove: ");
            System.out.println(i);
        }

        System.out.println(mySet.contains(1));
        System.out.println(mySet.contains(2));

        System.out.println("Size: " + mySet.size());

        mySet.clear();
        System.out.println("Size: " + mySet.size());

        System.out.println("HashSet is empty? " + mySet.isEmpty());

        
    }
}
