package Lessons.lesson17.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDisplay {
    public static void main(String[] args) {
        Queue<String> queue2 = new LinkedList<>();
        queue2.add("banana");
        queue2.add("apple");
        queue2.add("artichoke");
        queue2.add("pear");
        queue2.add("Apricot");

        while (queue2.peek() != null) {
            System.out.println(queue2.poll());
        }
    }
}