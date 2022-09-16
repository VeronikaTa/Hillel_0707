package Workshops.Lesson5.people;

public class MainPerson {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Brecht", "Herbert", "Weinstrasse 1", 20000);
        Customer customer1 = new Customer("Bayko", "Leo", "Vasylkivska 5", "AB1234");
        System.out.println(employee1.getSalary());
        System.out.println(customer1.getAccountNumber());
        employee1.display();
        customer1.display();
    }
}
