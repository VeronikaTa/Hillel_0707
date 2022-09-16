package Lessons.lesson14.Exceptions.myException;

public class MyExceptionDemo {
    public static void main(String[] args) throws MyException {
        compute(9);
        compute(11);
    }

    public static void compute(int a) throws MyException {
        System.out.println("Method compute is called with number " + a);

        if (a > 10) {
            throw new MyException(a, "Some trouble here");

        }
        System.out.println("The program ends normally");
    }
}
