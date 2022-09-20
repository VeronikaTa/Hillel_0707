package Lessons.lesson17.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class DequeEx {

    public static void main(String[] args) {
        Deque<Integer> stack2 = new LinkedList<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}
