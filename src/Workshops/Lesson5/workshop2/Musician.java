package Workshops.Lesson5.workshop2;

public class Musician {

    private String name;


    Musician(String musicianName) {
        this.name = musicianName;
    }

    public void play(String name) {
        System.out.println(name + " can play any instrument");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
