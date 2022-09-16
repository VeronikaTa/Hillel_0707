package Homeworks.lesson10;


import java.util.Scanner;

public class Calculator2 {

    public static double getDouble() {
        Scanner myScanner = new Scanner(System.in);
        int numberFromConsole = myScanner.nextInt();
        return numberFromConsole;
    }

    public static char getOperation() {
        Scanner myScanner = new Scanner(System.in);
        char operationSign = myScanner.nextLine().charAt(0);
        return operationSign;
    }

    public static double calculate(double firstDouble, double secondDouble, char operationSign) {
        double result = 0;
        switch (operationSign) {
            case '+':
                result = firstDouble + secondDouble;
                System.out.println("Your result is: " + result + "Enter S to leave the calculator; Press any button to continue");
                break;
            case '-':
                result = firstDouble - secondDouble;
                System.out.println("Your result is: " + result + " Enter S to leave the calculator; Press any button to continue");
                break;
            case '*':
                result = firstDouble * secondDouble;
                System.out.println("Your result is: " + result + " Enter S to leave the calculator; Press any button to continue");
                break;
            case '/':
                result = firstDouble / secondDouble;
                System.out.println("Your result is: " + result + " Enter S to leave the calculator. Press any button to continue");
                break;
            default:
                result = firstDouble;
                System.out.println("Sorry, I don't know such an operation sign. Your previous result: " + result);
                System.out.println("Enter S to leave the calculator; Press any button to continue");
        }
        return result;
    }

    public static char goOn() {
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
            System.out.println("Thank you! Now, enter your second number:");
            secondDouble = getDouble();
            System.out.println("Now, enter an operation sign: + - * /");
            operationSign = getOperation();
            firstDouble = calculate(firstDouble, secondDouble, operationSign);
            System.out.println(firstDouble);
            goOn = goOn();
            if (goOn == 'S' | goOn == 's') {
                stop = true;
                System.out.println("Good-bye!");
            }
        }
    }
}
