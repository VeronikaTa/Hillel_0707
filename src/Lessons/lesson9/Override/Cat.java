package Lessons.lesson9.Override;

import Lessons.lesson9.Override.Animal;

public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
