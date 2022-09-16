package Homeworks.lesson13;

public class LuckyNumber {

    public static int[] createLuckyArray() {
        int[] numbers = new int[10];
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random() * 10 + 1);
        }
        return numbers;
    }

    public static int setLucky(int[] numbers) {
        int lucky = 0;
        int index = (int) (Math.random() * 10 + 1);
        lucky = numbers[index];
        return lucky;
    }

    public static void findLucky(int[] numbers, int lucky) {
        for (int number : numbers) {
            if (number == lucky) {
                System.out.println("Here is the lucky number: " + lucky + " !");
                break;
            }
        }
    }
}
