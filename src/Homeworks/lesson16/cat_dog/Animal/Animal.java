package Homeworks.lesson16.cat_dog.Animal;

public class Animal {
    private String name;
    private String voice;
    private String type;

    {
        this.voice = "";
        this.type = "Animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'm a " + type + ". " + " My name is " + name + ". " + voice);
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setType(String type) {
        this.type = type;
    }
}
