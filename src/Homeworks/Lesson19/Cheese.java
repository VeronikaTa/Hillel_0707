package Homeworks.Lesson19;

public enum Cheese {
    CHEDDAR,
    SWISS,
    BLUE,
    BRIE,
    GOUDA,
    VEGAN;

    private static final double cheesePrice = 20;

    public static double getCheesePrice() {
        return cheesePrice;
    }
}
