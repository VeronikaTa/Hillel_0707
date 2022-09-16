package Workshops.Lesson5.people;

public class Employee extends Person {

    private int salary;

    Employee(String surname, String name, String homeAddress, int salary) {
        super(surname, name, homeAddress);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println(this.getSurname() + " " + this.getName() + " " + this.getHomeAddress() + " " + this.salary);
    }


}
