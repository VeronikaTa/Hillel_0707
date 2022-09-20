package Lessons.lesson17.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue3 = new PriorityQueue<>();
        queue3.add("banana");
        queue3.add("apple");
        queue3.add("artichoke");
        queue3.add("pear");
        queue3.add("Apricot");

        while (queue3.peek() != null) {
            System.out.println(queue3.poll());
        }
    }
}

