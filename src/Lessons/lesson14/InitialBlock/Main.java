package Lessons.lesson14.InitialBlock;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1.getName() + " " + dog1.getBreed() + " " + dog1.getAge());

        Dog dog2 = new Dog("Barky", "ppodle", 3);
        System.out.println(dog2.getName() + " " + dog2.getBreed() + " " + dog2.getAge());
    }
}
