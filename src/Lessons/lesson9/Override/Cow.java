package Lessons.lesson9.Override;

import Lessons.lesson9.Override.Animal;

public class Cow extends Animal {
    @Override
    public void voice() {
        System.out.println("Moo");
    }
}
