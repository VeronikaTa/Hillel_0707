package Lessons.lesson17.Comparator;

import java.util.TreeSet;

public class ComparatorEx {

    public static void main(String[] args) {
        TruckComparator truckComparator = new TruckComparator();

        TreeSet<Truck> trucks = new TreeSet<>(truckComparator);

        trucks.add(new Truck(3));
        trucks.add(new Truck(1));
        trucks.add(new Truck(6));

        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }
}
