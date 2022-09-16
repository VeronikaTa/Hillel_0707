package Lessons.lesson14.localInner;

public class Local_Inner {

    void myMethod() {
        int num = 888;

        //Local method of inner class
        class MethodInnerDemo {
            public void print() {
                System.out.println("Local method of inner class " + num);
            }
        }
        // Access to the inner class
        MethodInnerDemo inner1 = new MethodInnerDemo();
        inner1.print();

        System.out.println("Let's continue");
    }
}
