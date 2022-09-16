package Lessons.lesson3;

import java.util.Scanner;

public class Task1L3 {
    public static void main (String args[]){
        System.out.println("Please, enter two whole numbers: ");
        Scanner myScanner = new Scanner(System.in);
        int firstNumber = myScanner.nextInt();
        int secondNumber = myScanner.nextInt();
        int result = firstNumber + secondNumber;

        System.out.println("Please, enter a name: ");
        Scanner myScanner2 = new Scanner(System.in);
        String name = myScanner2.nextLine();

        System.out.println(name + " " + result);

    }
}
