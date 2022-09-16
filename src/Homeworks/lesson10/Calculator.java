package Homeworks.lesson10;

import java.util.Scanner;

public class Calculator {

    public static int getInt() {
        Scanner myScanner = new Scanner(System.in);
        int numberFromConsole = myScanner.nextInt();
        return numberFromConsole;
    }

    public static char getOperation() {
        Scanner myScanner = new Scanner(System.in);
        char operationSign = myScanner.nextLine().charAt(0);
        return operationSign;
    }

    public static int calculate(int firstInt, int secondInt, char operationSign) {
        int result = 0;
        switch (operationSign) {
            case '+':
                result = firstInt + secondInt;
                break;
            case '-':
                result = firstInt - secondInt;
                break;
            case '*':
                result = firstInt * secondInt;
                break;
            case '/':
                result = firstInt / secondInt;
                break;
            default:
                System.out.println("Sorry, I don't know such an operation sign.");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello! I am your calculator! Please, enter your first number:");
        int firstInt = getInt();
        System.out.println("Thank you! Now, enter your second number:");
        int secondInt = getInt();
        System.out.println("Now, enter an operation sign: + - * /");
        char operationSign = getOperation();
        int result = calculate(firstInt, secondInt, operationSign);
        System.out.println("Your result is: " + result);
    }
}
