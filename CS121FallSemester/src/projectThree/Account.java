package projectThree;

public class Account
{
    private double balance;
    private int accountNumber;
    private static int numberOfAccounts = 1000;

    public Account(double initialDeposit)
    {
        this.balance = initialDeposit;
        this.accountNumber = numberOfAccounts++;
    }

    public void deposit(double depositAmount)
    {
        balance = balance + depositAmount;
        System.out.printf("Successful deposit of $%.2f\nBalance: $%.2f",depositAmount,balance);
    }

    public void withdraw(double withdrawAmount)
    {
        balance = balance - withdrawAmount;
        System.out.printf("Successful withdraw of $%.2f\nBalance: $%.2f",withdrawAmount,balance);
    }

    public String toString()
    {
        return "Account Number: " + this.accountNumber + ", Balance: $" + this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
