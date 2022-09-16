package Workshops.Lesson5.people;

public class Person {
    private String surname;
    private String name;
    private String homeAddress;

    Person(String surname, String name, String homeAddress) {
        this.surname = surname;
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void display() {
        System.out.println(this.surname + " " + this.name + " " + this.homeAddress);
    }
}
