package Lessons.lesson14.varargs;

public class Varargs_Demo {

    public static void main(String[] args) {
        int sum = addAll(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public static int addAll(int... numbers) {

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
