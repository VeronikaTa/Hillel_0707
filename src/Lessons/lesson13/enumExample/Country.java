package Lessons.lesson13.enumExample;

public enum Country {
    CANADA("CAD"),
    POLAND("PLN"),
    UK("POUND"),
    GERMANY("EURO"),
    ZIMBABWE(),
    CUBA;

    String currency;

    Country(String currency) {
        this.currency = currency;
    }

    Country() {
    }
}
