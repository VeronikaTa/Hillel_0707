package Lessons.lesson17.ComparableEx;

import java.util.TreeSet;

public class ComparebleEx {

    public static void main(String[] args) {
        TreeSet<Cars> cars = new TreeSet<>();
        cars.add(new Cars(23));
        cars.add(new Cars(1));
        cars.add(new Cars(5));
        cars.add(new Cars(30));

        for (Cars car : cars) {
            System.out.println(car);
        }


        TreeSet<Motorcycle> motorcycles = new TreeSet<>();
        motorcycles.add(new Motorcycle("Yamaha", 5));
        motorcycles.add(new Motorcycle("Hitachi", 6));
        motorcycles.add(new Motorcycle("Vespa", 1));

        for (Motorcycle motorcycle : motorcycles) {
            System.out.println(motorcycle);
        }
    }
}
