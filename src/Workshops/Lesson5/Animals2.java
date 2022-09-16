package Workshops.Lesson5;

public class Animals2 {
    public static void main(String[] args) {
        int sheep = 5;


        for (int i = 1; i <= 4; i++) {
            String goose = "goose";
            String are = "are";
            if (i > 1) {
                goose = "geese";
            }
            if (i == 4) {
                are = "is";
            }
            System.out.println("There " + are + " " + --sheep + " sheep and " + i + " " + goose + " in the house.");
        }
    }
}
/*
 б) змінити закінчення в залежності від числа, яке стоїть перед словом гуска и вівця.
	“В хатинці є 1 гуска и 4 вівці”
	“В хатинці є 2 гускі и 3 вівці”
 */
