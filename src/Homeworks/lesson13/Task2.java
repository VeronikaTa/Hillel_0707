package Homeworks.lesson13;

public class Task2 {
    public static int[] setArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return numbers;
    }

    public static int[] changeArray(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }
        return numbers;
    }

    public static void toConsole(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        int[] numbers = setArray();
        int[] changedArray = changeArray(numbers);
        toConsole(changedArray);
    }
}


