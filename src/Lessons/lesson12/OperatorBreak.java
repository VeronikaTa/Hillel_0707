package Lessons.lesson12;

public class OperatorBreak {
    public static void main(String[] args) {
        int i = 1;
        int a = 5;

        while (i < 10) {
            System.out.println("Loop number " + i);
            if (i == a) {
                break;
            }
            i++;
        }

        for (int j = 0; j <= 10; j++) {
            System.out.println("Group 1 loop " + j);
            for (int k = 0; k < 10; k++) {
                System.out.println("Group 2 loop " + k);
                if (k == a) {
                    break;
                }
            }
        }
    }
}
