package Homeworks.lesson16.Main;

import Homeworks.lesson16.cat_dog.Animal.Animal;
import Homeworks.lesson16.cat_dog.Cat.Cat;
import Homeworks.lesson16.cat_dog.Dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class PracticeCat_Dog {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
