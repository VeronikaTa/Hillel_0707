package Workshops.workshop2;

import java.util.Arrays;

public class Task4 {
    /**
     * Дано: массив целых чисел.
     * Требуется: Вывести на консоль отдельно чётные и нечётные числа.
     * Пример. Массив: 5, -3, -8, 81, 13
     * Вывод:
     * Чётные числа: -8
     * Нечётные: 5, -3, 81, 13
     * Примечание:
     * Вычисление чета и нечета должны быть оформлены в виде функций, которая как параметр берет
     * в себя исходный массив и возвращает вычисленый массив.
     * Печать на консоль должна быть оформлена в виде функции, которая на вход берет массив и выводит его на консоль,
     * используя цикл while. При этом формат должен быть:
     * <число>, <число>, <число>. В конце без запятой
     */
    public static void main(String[] args) {
        int[] array = {5, -3, -8, 81, 13};
        System.out.print("Массив: ");
        printArray(array);
        int[] oddNumbers = oddNumbers(array);
        System.out.print("Четные: ");
        printArray(oddNumbers);
        int[] evenNumbers = evenNumbers(array);
        System.out.print("Нечетные: ");
        printArray(evenNumbers);
    }

    public static int[] oddNumbers(int[] array) {
        int[] oddNumbers = new int[0];

        for (int number : array) {
            if ((number % 2) != 0) {
                int numbersLength = oddNumbers.length;
                oddNumbers = Arrays.copyOf(oddNumbers, oddNumbers.length + 1);
                oddNumbers[numbersLength] = number;
            }
        }
        return oddNumbers;
    }

    public static int[] evenNumbers(int[] array) {
        int[] evenArray = new int[0];
        int i = 0;
        while (i < array.length) {
            if ((array[i] % 2) == 0) {
                int numbersLength = evenArray.length;
                evenArray = Arrays.copyOf(evenArray, evenArray.length + 1);
                evenArray[numbersLength] = array[i];
            }
            i++;
        }
        return evenArray;
    }

    public static void printArray(int[] array) {
        int lastIndex = array.length - 1;
        int i = 0;
        while (i < lastIndex) {
            System.out.print(array[i] + ", ");
            i++;
        }
        System.out.println(array[lastIndex]);
    }
}
