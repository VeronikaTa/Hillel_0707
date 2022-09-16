package Workshops.Lesson5.workshop2;

public class Keyboardist extends Musician {

    Keyboardist(String musicianName) {
        super(musicianName);
    }

    public void play(String name) {
        System.out.println(name + " can play keyboard");
    }
}
