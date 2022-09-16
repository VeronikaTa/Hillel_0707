package Homeworks.lesson13;

public class Task1 {

    private static int[] createArray() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return numbers;
    }

    private static void findLuckyNumber(int[] numbers) {

        for (int number : numbers) {
            if (number == 3) {
                System.out.println("Here is the lucky number: " + 3 + " !");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = createArray();
        findLuckyNumber(numbers);
    }
}
