package Lessons.lesson13.enumExample;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(Cars.TOYOTA);
        System.out.println(Cars.valueOf("TOYOTA"));

        System.out.println(Cars.BMW);
        System.out.println(Cars.valueOf("BMW"));

        System.out.println(Cars.HONDA);
        System.out.println(Cars.valueOf("HONDA"));

        for (Cars car : Cars.values()) {
            System.out.println(car);
        }


        Scanner scanner1 = new Scanner(System.in);
        String carIn = scanner1.nextLine();

        for (Cars c : Cars.values()) {
            if (c.name().equalsIgnoreCase(carIn)) {
                System.out.println("We have " + carIn + " on our list");
                break;
            } else if (c.ordinal() == 2 && !c.name().equalsIgnoreCase(carIn)) {
                System.out.println("There is no such car on our list");
            }
        }

    }
}
