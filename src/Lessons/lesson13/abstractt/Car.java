package Lessons.lesson13.abstractt;

abstract class Car {
    abstract String maxSpeed();

    abstract void drive();

    abstract void carBreak();

    public void countWheels() {
        System.out.println("4");
    }
}
