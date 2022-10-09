package Homeworks.lesson21;

public class Individual implements IClient {
    private double amountOnAccount;

    {
        System.out.println("New individual account created");
    }

    @Override
    public void deposit(double amountToDeposit) {
        amountOnAccount += amountToDeposit;
        System.out.println(amountToDeposit + " deposited.");
    }

    @Override
    public void withdraw(double amountToWithdraw) {
        amountOnAccount -= amountToWithdraw;
        System.out.println(amountToWithdraw + " withdrawn.");
    }

    @Override
    public void showBalance() {
        System.out.println("Current amount: " + amountOnAccount);
    }

    @Override
    public String toString() {
        return "This is an individual account. You can deposit and withdraw with no commission is charged. Your current amount: " + amountOnAccount;
    }
}
