package Homeworks.Lesson19;

import java.util.Scanner;

public class MakeAnOrder {
    public static void makeAnOrder() {
        Scanner scanner = new Scanner(System.in);
        String bun;
        String[] patty = new String[2];
        String[] sauce = new String[2];
        String[] cheese = new String[2];
        String choice;
        boolean addIngredient = true;

        System.out.println("Welcome to BurgerQueen!\n Please, make your order.\n");
        bun = chooseBun();
        patty[0] = choosePatty();
        sauce[0] = chooseSauce();
        cheese[0] = chooseCheese();


        while (addIngredient) {
            System.out.println("Would you like an additional ingredient? Yes / No");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                boolean invalidIngredient = false;
                do {
                    System.out.println("Enter a number or  name. Choose one:" +
                            "\n Number 0: patty (" + MeatPatty.getPattyPrice() + " UAH). \n" +
                            "Number 1: sauce (" + Sauce.getSaucePrice() + " UAH). \n" +
                            "Number 2: cheese (" + Cheese.getCheesePrice() + "Uah). \n");
                    choice = scanner.nextLine();
                    if (choice.equals("0") || choice.equalsIgnoreCase("patty")) {
                        patty[1] = choosePatty();
                    } else if (choice.equals("1") || choice.equalsIgnoreCase("sauce")) {
                        sauce[1] = chooseSauce();
                    } else if (choice.equals("2") || choice.equalsIgnoreCase("cheese")) {
                        cheese[1] = chooseCheese();
                    } else {
                        System.out.println("Sorry. Invalid choice.Try again:");
                        invalidIngredient = true;
                    }
                }
                while (invalidIngredient);
            } else if (choice.equalsIgnoreCase("no")) {
                addIngredient = false;
            } else {
                System.out.println("Sorry. Invalid choice. Try again:");
            }
        }

        Burger burger = new Burger(bun, sauce, cheese, patty);

        System.out.println(burger.toString());
    }


    private static String chooseBun() {
        Scanner scanner1 = new Scanner(System.in);
        boolean choiceInValid = true;
        String choice;
        String bun = null;

        do {
            for (Bun bunOption : Bun.values()) {
                System.out.println(bunOption.ordinal() + " " + bunOption.toString().toLowerCase());
            }
            System.out.println("Choose a bun. Enter the number or the bun type:");
            choice = scanner1.nextLine();
            for (Bun bunOption : Bun.values()) {
                bun = choice.equalsIgnoreCase(String.valueOf(bunOption)) || choice.equals(String.valueOf(bunOption.ordinal())) ? bunOption.toString() : null;
                if (bun != null) {
                    choiceInValid = false;
                    break;
                }
            }
        }
        while (choiceInValid);
        return bun;
    }

    private static String choosePatty() {
        Scanner scanner1 = new Scanner(System.in);
        boolean choiceInValid = true;
        String choice;
        String patty = null;

        do {
            for (MeatPatty pattyOption : MeatPatty.values()) {
                System.out.println(pattyOption.ordinal() + " " + pattyOption.toString().toLowerCase());
            }
            System.out.println("Choose a patty. Enter the number or the meat type:");
            choice = scanner1.nextLine();
            for (MeatPatty meatOption : MeatPatty.values()) {
                patty = choice.equalsIgnoreCase(String.valueOf(meatOption)) || choice.equals(String.valueOf(meatOption.ordinal())) ? meatOption.toString() : null;
                if (patty != null) {
                    choiceInValid = false;
                    break;
                }
            }
        }
        while (choiceInValid);
        return patty;
    }

    private static String chooseSauce() {
        Scanner scanner1 = new Scanner(System.in);
        boolean choiceInValid = true;
        String choice;
        String sauce = null;

        do {
            for (Sauce sauceOption : Sauce.values()) {
                System.out.println(sauceOption.ordinal() + " " + sauceOption.toString().toLowerCase());
            }
            System.out.println("Choose a sauce. Enter the number or the sauce name:");
            choice = scanner1.nextLine();
            for (Sauce sauceOption : Sauce.values()) {
                sauce = choice.equalsIgnoreCase(String.valueOf(sauceOption)) || choice.equals(String.valueOf(sauceOption.ordinal())) ? sauceOption.toString() : null;
                if (sauce != null) {
                    choiceInValid = false;
                    break;
                }
            }
        }
        while (choiceInValid);
        return sauce;
    }

    private static String chooseCheese() {
        Scanner scanner1 = new Scanner(System.in);
        String cheese = null;
        boolean choiceInValid = true;
        String choice = null;

        do {
            for (Cheese cheeseOption : Cheese.values()) {
                System.out.println(cheeseOption.ordinal() + " " + cheeseOption.toString().toLowerCase());
            }
            System.out.println("Choose cheese. Enter the number or the cheese name:");
            choice = scanner1.nextLine();
            for (Cheese cheeseOption : Cheese.values()) {
                cheese = choice.equalsIgnoreCase(String.valueOf(cheeseOption)) || choice.equals(String.valueOf(cheeseOption.ordinal())) ? cheeseOption.toString() : null;
                if (cheese != null) {
                    choiceInValid = false;
                    break;
                }
            }
        }
        while (choiceInValid);
        return cheese;
    }
}
