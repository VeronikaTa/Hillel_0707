package Workshops.Lesson5.workshop2;

public class Guitarist extends Musician {

    Guitarist(String musicianName) {
        super(musicianName);
    }

    public void play(String name) {
        System.out.println(name + " can play a guitar");
    }
}
