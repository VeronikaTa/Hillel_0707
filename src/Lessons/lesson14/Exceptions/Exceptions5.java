package Lessons.lesson14.Exceptions;

import java.util.Scanner;

public class Exceptions5 {

    public static void main(String[] args) {
        System.out.println("Enter an index to use");
        Scanner myScanner = new Scanner(System.in);
        int index = myScanner.nextInt();

        int[] arr = {3, 4, 5};

        try {
            int result = arr[index] / 0;
            System.out.println(result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is no such number");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }

        System.out.println("Let's continue");

    }
}
