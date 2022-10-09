package Homeworks.lesson21;

public class Entrepreneur implements IClient {

    private double amountOnAccount;

    {
        System.out.println("New entrepreneur account is created.");
    }

    @Override
    public void deposit(double amountToDeposit) {
        double commission = amountToDeposit < 1000 ? amountToDeposit / 100 : amountToDeposit * 0.5 / 100;
        amountOnAccount += amountToDeposit - commission;
        System.out.println(amountToDeposit + " deposited");
    }

    @Override
    public void withdraw(double amountToWithdraw) {
        amountOnAccount -= amountToWithdraw;
        System.out.println(amountToWithdraw + " withdrawn");
    }

    @Override
    public void showBalance() {
        System.out.println("Current amount: " + amountOnAccount);
    }

    @Override
    public String toString() {
        return "This is entrepreneur account. 1% commission is charged for depositing a sum less than 1000, 0.5% commission is charged for depositing a sum of 1000 or greater. Current amount: " + amountOnAccount;
    }
}
