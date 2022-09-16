package Lessons.lesson9.Override;

import Lessons.lesson9.Override.Animal;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Woof");
    }
}
