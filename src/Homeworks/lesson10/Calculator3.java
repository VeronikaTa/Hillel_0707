package Homeworks.lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator3 {

    public static double getDouble() {
        double numberFromConsole = 0;
        boolean tryAgain = false;
        do {
            try {
                tryAgain = false;
                Scanner myScanner = new Scanner(System.in);
                numberFromConsole = myScanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please, try again:");
                tryAgain = true;
            }
        }
        while (tryAgain);

        return numberFromConsole;
    }

    public static boolean isInvalidOperationSign(char value) {
        char[] operations = {'+', '-', '*', '/'};
        for (char operation : operations) {
            if (operation == value) {
                return false;
            }
        }
        return true;
    }

    public static char getOperation() {
        char operationSign = '\u0000';
        while (isInvalidOperationSign(operationSign)) {
            try {
                Scanner myScanner = new Scanner(System.in);
                operationSign = myScanner.nextLine().charAt(0);

            } catch (InputMismatchException e) {
                System.out.println("Please, try again:");
            }
        }
        return operationSign;
    }

    public static void validateDivisionByZero(double value, char sign) throws DivisionByZero {
        if (value == 0 && sign == '/') {
            throw new DivisionByZero("Division by zero is impossible");
        }
    }

    public static double calculate(double firstDouble, double secondDouble, char operationSign) {
        double result = 0;

        try {
            validateDivisionByZero(secondDouble, operationSign);
            switch (operationSign) {
                case '+':
                    result = firstDouble + secondDouble;
                    System.out.println("Your result is: " + result);
                    break;
                case '-':
                    result = firstDouble - secondDouble;
                    System.out.println("Your result is: " + result);
                    break;
                case '*':
                    result = firstDouble * secondDouble;
                    System.out.println("Your result is: " + result);
                    break;
                case '/':
                    result = firstDouble / secondDouble;
                    System.out.println("Your result is: " + result);
                    break;
                default:
                    result = firstDouble;
                    System.out.println("Sorry, I don't know such an operation sign. Your previous result: " + result);
                    System.out.println("Enter S to leave the calculator; Press any button to continue");
            }
        } catch (DivisionByZero e) {
            System.out.println("Let`s try again! " + "Your first number is " + firstDouble);
            result = firstDouble;
        }
        return result;
    }

    public static char goOn() {
        System.out.println("Enter S to leave the calculator. Press any button to continue");
        Scanner myScanner = new Scanner(System.in);
        char goOn = myScanner.nextLine().charAt(0);
        return goOn;
    }

    public static void main(String[] args) {
        System.out.println("Hello! I am your calculator! Please, enter your first number:");

        double firstDouble = getDouble();

        boolean stop = false;
        double secondDouble;
        char operationSign;
        char goOn;

        while (stop == false) {
            System.out.println("Now, enter your second number:");
            secondDouble = getDouble();
            System.out.println("Now, enter an operation sign: + - * /");
            operationSign = getOperation();
            firstDouble = calculate(firstDouble, secondDouble, operationSign);
            goOn = goOn();
            if (goOn == 'S' | goOn == 's') {
                stop = true;
                System.out.println("Good-bye!");
            }
        }
    }
}

