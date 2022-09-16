package Workshops.Lesson5.people;

public class Customer extends Person {
    private String accountNumber;

    Customer(String surname, String name, String homeAddress, String accountNumber) {
        super(surname, name, homeAddress);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void display() {
        System.out.println(this.getName() + " " + this.getName() + " " + this.getHomeAddress() + " " + this.accountNumber);
    }


}
