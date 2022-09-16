package Lessons.lesson14.AnonymousClasses;

class Main {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        myClass1.displayMessage(new Message() {
            public String sayHello() {
                return "Hello";
            }
        });

    }
}
