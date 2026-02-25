package OOPS.abstraction;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposited in current account");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn in current account");
    }
}