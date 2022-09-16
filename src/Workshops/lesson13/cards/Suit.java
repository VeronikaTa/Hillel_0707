package Workshops.lesson13.cards;

public enum Suit {

    DIAMONDS(9),
    CLUBS(9),
    HEARTS(9),
    SPADES(9);

    private int cardsNumber;

    Suit(int cardsNumber) {
        this.cardsNumber = cardsNumber;
    }

    public int getCardsNumber() {
        return cardsNumber;
    }
}
