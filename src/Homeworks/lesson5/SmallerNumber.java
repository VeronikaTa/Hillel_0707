package Homeworks.lesson5;

import java.util.Scanner;

public class SmallerNumber {

    public static int getSmallerNumber(int firstNumber, int secondNumber) {

        if (firstNumber < secondNumber)
            return firstNumber;

        return secondNumber;
    }

    public static void main(String[] args) {
        System.out.println("Please, enter two numbers:");
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("The smaller number is " + getSmallerNumber(firstNumber, secondNumber));
    }
}
