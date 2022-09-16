package Homeworks.lesson3;

import java.util.Scanner;

public class Task3Variant {
    public static void main(String[] args) {
        System.out.println("Choose a number: 1, 2, 3");

        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("The number entered isn't equal to 1, 2, or 3");
        }
    }
}
