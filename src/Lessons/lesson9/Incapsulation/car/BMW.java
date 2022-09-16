package Lessons.lesson9.Incapsulation.car;

import Lessons.lesson9.Incapsulation.Specifications.Specifications;

public class BMW {
    public static void main(String[] args) {
        Specifications bmwFuel = new Specifications();
        System.out.println(bmwFuel.fuel);

        bmwFuel.fuel = "diesel";
        System.out.println(bmwFuel.fuel);

        Specifications ferrariFuel = new Specifications();
        System.out.println(ferrariFuel.fuel);
    }
}
