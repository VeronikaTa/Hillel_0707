package Lessons.lesson14.InitialBlock;

public class StaticInitialization {

    static int i;

    static {
        i = 25;
    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}
