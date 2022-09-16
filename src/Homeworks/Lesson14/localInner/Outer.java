package Homeworks.Lesson14.localInner;

public class Outer {
    public void outerDemo() {
        int number = 0;
        System.out.println("That is number one: " + number);

        class Inner {
            public int innerDemo() {
                return number + 1;
            }
        }
        Inner myInner = new Inner();
        int number2 = myInner.innerDemo();
        System.out.println("Number two is: " + number2);
    }
}
