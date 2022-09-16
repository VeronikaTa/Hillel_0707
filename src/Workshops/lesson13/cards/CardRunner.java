package Workshops.lesson13.cards;

public class CardRunner {

    public static void main(String[] args) {
        Rank rank = Rank.ACE;
        System.out.println(rank.getTranslation());

        Suit suit = Suit.DIAMONDS;
        System.out.println(suit.name());
        Rank rankKing = Rank.KING;
        System.out.println(rankKing.ordinal());
        System.out.println(rankKing.name() + " " + rankKing.getTranslation());
    }
}
