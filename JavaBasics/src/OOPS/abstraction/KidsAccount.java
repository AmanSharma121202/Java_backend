package OOPS.abstraction;

public class KidsAccount extends BankAccount {
    public KidsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
       System.out.println("Deposited in kids account");
    }

    @Override
    public void withdraw(double amount) {
       System.out.println("Withdrawn in kids account");
    }
}
