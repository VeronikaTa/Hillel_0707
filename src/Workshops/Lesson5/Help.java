package Workshops.Lesson5;

public class Help {
    public static void main(String[] args) {
        String s = "help";
        change(s);
    }

    static void change(String str) {
        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str);
            str = str.substring(1) + str.charAt(0);
        }
    }
}
//5. ??????? ??????? ?? ???? ?????? ?????? ?????? ? ????? ??????, ????? help:
//help
//elph
//lphe
//phel

