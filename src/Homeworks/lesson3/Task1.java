package Homeworks.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        System.out.println("Please, enter 1");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("You entered 1");
        } else {
            System.out.println("The number entered isn't equal to 1");
        }
    }
}
