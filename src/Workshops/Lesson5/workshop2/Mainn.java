package Workshops.Lesson5.workshop2;

public class Mainn {
    public static void main(String[] args) {
        Musician musician1 = new Musician("Peter");
        Keyboardist keyboardist1 = new Keyboardist("Helen");
        Guitarist guitarist1 = new Guitarist("George");


        Musician[] musicians = {musician1, keyboardist1, guitarist1};

        for (Musician musician : musicians) {
            String name = musician.getName();
            musician.play(name);
        }
    }
}
