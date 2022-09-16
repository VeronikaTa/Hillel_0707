package Homeworks.lesson7;

public class L7H1 {
    public static void intChain() {
        String hello = "Hello";
        String world = "World";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print(hello.concat(world) + " ");
                } else {
                    System.out.print(hello + " ");
                }
            } else if (i % 5 == 0) {
                System.out.print(world + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        intChain();
    }
}
