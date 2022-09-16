package Homeworks.lesson6;

public class Pyramid6 {
    public static void pyramid6() {
        System.out.println("Let's create a pyramid out of stars!");

        int steps = 5;
        int blank = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < steps; k++) {
                if (k == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
            steps--;
            blank++;
        }
    }

    public static void main(String[] args) {
        pyramid6();
    }
}



