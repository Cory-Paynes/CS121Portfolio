package projectThree;

import java.util.ArrayList;
import java.util.List;

public class Customer
{
    private String firstName;
    private String lastName;
    private int pinNumber;
    private List<Account> accounts;

    public Customer(String firstName, String lastName, int pinNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinNumber = pinNumber;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account)
    {
        this.accounts.add(account);
    }

    public void removeAccount(Account account)
    {
        this.accounts.remove(account);
    }

    public Account getAccount(int accountNumber)
    {
        for(Account account : accounts)
        {
            if (account.getAccountNumber() == accountNumber)
            {
                return account;
            }
            
        }
        return null;
    }

    public String getAllAccounts()
    {
        StringBuilder accountInfo = new StringBuilder();
        for(Account account : accounts) {
            accountInfo.append(account.toString()).append("\n");
        }
        return accountInfo.toString();
    }

    @Override
    public String toString() {
        return "Account Holder: " + firstName + " " + lastName + ", PIN: " + pinNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
