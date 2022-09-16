package Lessons.lesson11;

public class Ternary {
    public static void ternary(String str) {
        char lastChar = str.charAt(str.length() - 1);

        System.out.println(lastChar == '?' ? "Question at the end" : "Without question at the end");
    }

    public static void main(String[] args) {
        String str = "hello?";
        ternary(str);
    }
}
