package Homeworks.lesson13;

import static Homeworks.lesson13.LuckyNumber.*;

public class MainLucky {

    public static void main(String[] args) {
        int[] numbers = createLuckyArray();
        int lucky = setLucky(numbers);
        findLucky(numbers, lucky);
    }
}
