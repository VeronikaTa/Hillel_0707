package Lessons.lesson17.Stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(9);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }


}
