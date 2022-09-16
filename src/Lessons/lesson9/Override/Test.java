package Lessons.lesson9.Override;

import Lessons.lesson9.Override.Cat;
import Lessons.lesson9.Override.Dog;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        Dog dog = new Dog();
        dog.voice();
    }
}
