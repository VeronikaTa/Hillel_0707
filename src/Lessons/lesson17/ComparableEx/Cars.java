package Lessons.lesson17.ComparableEx;

public class Cars implements Comparable<Cars> {

    int year;

    public Cars(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "year=" + year +
                '}';
    }

    @Override
    public int compareTo(Cars car) {
        if (this.year == car.year) {
            return 0;
        } else if (this.year > car.year) {
            return 1;
        } else {
            return -1;
        }

    }
}
