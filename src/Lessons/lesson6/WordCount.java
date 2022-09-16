package Lessons.lesson6;

import java.util.Scanner;

public class WordCount {
    public static void wordCount(String str) {
        int count = 0;
        System.out.println(str.length());
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a sentence:");

        String sentence = input.nextLine();
        wordCount(sentence);
    }
}

