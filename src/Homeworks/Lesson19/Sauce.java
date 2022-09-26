package Homeworks.Lesson19;

public enum Sauce {
    KETCHUP,
    MAYO,
    AIOLI,
    CHIPOTLE;

    private static final double saucePrice = 10;

    public static double getSaucePrice() {
        return saucePrice;
    }
}
