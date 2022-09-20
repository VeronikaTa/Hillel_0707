package Lessons.lesson17.ComparableEx;

public class Motorcycle implements Comparable<Motorcycle> {
    int year;
    String model;

    public Motorcycle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return model + " " + year;
    }

    @Override
    public int compareTo(Motorcycle motorcycle) {
        return this.model.compareTo(String.valueOf(motorcycle));
    }
}
