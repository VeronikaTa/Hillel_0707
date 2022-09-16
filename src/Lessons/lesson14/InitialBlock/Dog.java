package Lessons.lesson14.InitialBlock;

public class Dog {
    private String name;
    private String breed;
    private int age;

    {
        name = "Sharik";
        breed = "Shepherd";
        age = 2;
        System.out.println("This is non-static initialization block");
    }

    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    Dog() {

    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
