package Junit.UnitTesting_MoreExamples;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountOfType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountOfType;
    }

    //'branch' argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM.
    public double deposit(double amount, boolean branch){
        this.balance += amount;
        return balance;
    }

    //'branch' argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM.
    public double withdraw(double amount, boolean branch){
        if((amount > 500.00) & !branch){
            throw new IllegalArgumentException();
        }
        this.balance -= amount;
        return balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean isChecking(){
        return this.accountType == CHECKING;
    }

}
