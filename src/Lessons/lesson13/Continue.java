package Lessons.lesson13;

public class Continue {//позволяет проигнорировать часть кода ниже и продолжить итерацию

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Before \"continue\"");
            if (i > 2) {
                System.out.println("Ignore and continue iteration");
                continue;
            }
            System.out.println("I am displayed just twice");
        }
    }
}
