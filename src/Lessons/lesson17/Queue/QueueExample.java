package Lessons.lesson17.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(5);

        for (int i : queue) {
            System.out.println(i);
        }

        queue.poll();
        System.out.println("After polling: ");
        for (int i : queue) {
            System.out.println(i);
        }

        queue.remove(2);
        System.out.println("After second removing: ");
        for (int i : queue) {
            System.out.println(i);
        }

        queue.offer(6);

        queue.remove();
        System.out.println("After third removing and offering: ");
        for (int i : queue) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Let's peek " + queue.element());
        System.out.println();

        queue.poll();
        queue.poll();
        System.out.println("Let's peek " + queue.peek());

    }

}
