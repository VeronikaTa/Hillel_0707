package Lessons.lesson7;

public class Randomizer {
    public static void main(String[] args) {
        double a = Math.random();
        System.out.println(a);

        double b = Math.random() * 3;
        System.out.println(b);

        double c = Math.random() + 2;
        System.out.println(c);

        int d = (int) (Math.random() * 3);
        System.out.println(d);

        String text = "Hello, my name is Maksim";
        String[] words = text.trim().split(" ");

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words.length);
    }
}
