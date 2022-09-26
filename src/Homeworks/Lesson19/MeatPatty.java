package Homeworks.Lesson19;

public enum MeatPatty {
    BEEF,
    PORK,
    VEGAN;

    private static final double pattyPrice = 30;

    public static double getPattyPrice() {
        return pattyPrice;
    }
}
