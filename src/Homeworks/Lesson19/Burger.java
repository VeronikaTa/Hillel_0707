package Homeworks.Lesson19;

import java.util.Arrays;

public class Burger {
    private String bun;
    private String[] sauce;
    private String[] cheese;
    private String[] patty;
    private double burgerPrice;
    private static final double defaultPrice = 50;


    Burger(String bun, String[] sauce, String[] cheese, String[] patty) {
        this.bun = bun;
        this.sauce = Arrays.copyOf(sauce, 2);
        this.cheese = Arrays.copyOf(cheese, 2);
        this.patty = Arrays.copyOf(patty, 2);
        setBurgerPrice();
    }

    public void setBurgerPrice() {
        double optionalSauces = this.sauce[1] != null ? 1 : 0;
        double optionalPatties = this.patty[1] != null ? 1 : 0;
        double optionalCheeses = this.cheese[1] != null ? 1 : 0;
        this.burgerPrice = defaultPrice + optionalSauces * Sauce.getSaucePrice() + optionalPatties * MeatPatty.getPattyPrice() + optionalCheeses * Cheese.getCheesePrice();
    }

    @Override
    public String toString() {
        String sauceNames = null;

        if (this.sauce[1] == null) {
            sauceNames = this.sauce[0];
        } else {
            sauceNames = this.sauce[0] + " " + this.sauce[1];
        }

        String cheeseNames = null;

        if (this.cheese[1] == null) {
            cheeseNames = this.cheese[0];
        } else {
            cheeseNames = this.cheese[0] + " " + this.cheese[1];
        }

        String pattyNames = null;
        if (this.patty[1] == null) {
            pattyNames = this.patty[0];
        } else {
            pattyNames = this.patty[0] + " " + this.patty[1];
        }
        return "Your burger: \n" +
                "bun:" + bun.toLowerCase() +
                ", sauce:" + sauceNames.toLowerCase() +
                ", cheese:" + cheeseNames.toLowerCase() +
                ", patty:" + pattyNames.toLowerCase() +
                ", \nPrice:" + burgerPrice + " UAH";
    }
}
