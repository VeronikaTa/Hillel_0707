package Lessons.lesson17.Comparator;

import java.util.Comparator;

public class TruckComparator implements Comparator<Truck> {

    @Override
    public int compare(Truck o1, Truck o2) {
        if (o1.year == o2.year) {
            return 0;
        } else if (o1.year < o2.year) {
            return -1;
        } else {
            return 1;
        }
    }
}
