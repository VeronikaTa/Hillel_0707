package Lessons.lesson11;

public class Task1 {
    public static void main(String[] args) {
        int a;
        a = 10;
        if (++a == 7 & ++a != 3) {
            a++;
        }
        System.out.println(a);

        int b = 10;
        if (++b == 10 && ++b == 5) {
            b++;
        }
        System.out.println(b);
    }
}
