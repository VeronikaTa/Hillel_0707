package Homeworks.lesson21;

public class LegalPerson implements IClient {

    private double amountOnAccount;

    {
        System.out.println("New legal person account is created.");
    }

    @Override
    public void deposit(double amountToDeposit) {
        amountOnAccount += amountToDeposit;
        System.out.println(amountToDeposit + " deposited.");
    }

    @Override
    public void withdraw(double amountToWithdraw) {
        double commission = amountToWithdraw / 100;
        amountOnAccount -= amountToWithdraw + commission;
        System.out.println(amountToWithdraw + " withdrawn");
    }

    @Override
    public void showBalance() {
        System.out.println("Current amount: " + amountOnAccount);
    }

    @Override
    public String toString() {
        return "This is legal person account. 1% commission is charged for withdrawing. Current amount: " + amountOnAccount;
    }
}
