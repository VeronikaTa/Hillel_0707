package Workshops.lesson13.cards;

public enum Rank {
    SIX("шестерка"),
    SEVEN("семерка"),
    EIGHT("восьмерка"),
    NINE("девятка"),
    TEN("десятка"),
    JACK("валет"),
    QUEEN("дама"),
    KING("король"),
    ACE("туз");

    private String translation;

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "translation='" + translation;
    }

    Rank(String translation) {
        this.translation = translation;
    }

}
