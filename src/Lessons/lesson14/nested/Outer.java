package Lessons.lesson14.nested;

public class Outer {
    int num;

    //nested class
    private class Inner_Demo {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    void displayInner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

