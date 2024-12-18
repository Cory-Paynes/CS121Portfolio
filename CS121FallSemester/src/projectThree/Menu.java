package projectThree;

import java.util.Scanner;

public class Menu
{
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();


    public void runMenu()
    {
        boolean exit = false;
        System.out.println("\n**********MENU**********\n\nPlease make a selection:\n1) Access Account\n2) Open a New Account\n3) Close All Accounts\n4) Exit");
        while (!exit) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 1)
            {
                accessAccount();
            }
            else if (input == 2)
            {
                openAccount();
            }
            else if (input == 3)
            {
                closeAllAccounts();
            }
            else if (input == 4)
            {
                exit = true;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
    }

    private void accessAccount()
    {
        System.out.println("Please Enter your PIN:");
        int pinNumber = Integer.parseInt(scanner.nextLine());
        Customer customer = bank.getCustomer(pinNumber);
        if(customer == null)
        {
            System.out.println("PIN is not Valid");
            runMenu();
        }
        else
        {
            String customerInfo = customer.getAllAccounts();
            System.out.printf("***Active Accounts***\n%s",customerInfo);
            System.out.println("Please enter the account number of the account you would like to access:");
            int accountNumber = Integer.parseInt(scanner.nextLine());
            Account account = customer.getAccount(accountNumber);
            if(customer.getAccount(accountNumber) == null)
            {
                System.out.println("Account number is invalid");
                runMenu();
            }
            else
            {
                boolean exit = false;
                while (!exit)
                {
                    System.out.println("\nPlease make a selection:\n1) Make a Deposit\n2) Make a Withdrawal\n3) See Account Balance\n4) Close Account\n5) Exit");
                    int input = Integer.parseInt(scanner.nextLine());
                    if(input == 1)
                    {
                        System.out.println("Enter Deposit Amount:");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        account.deposit(depositAmount);
                    }
                    else if (input == 2)
                    {
                        System.out.println("Enter Withdrawal Amount:");
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        account.withdraw(withdrawAmount);
                    }
                    else if (input == 3)
                    {
                        System.out.printf("Account Balance: $%.2f",account.getBalance());
                    }
                    else if (input == 4)
                    {
                        customer.removeAccount(account);
                        System.out.println("Account Successfully Removed");
                    }
                    else if (input == 5)
                    {
                        exit = true;
                    }
                    else
                    {
                        System.out.println("Invalid Input");
                    }
                }
            }
        }
        runMenu();
    }

    private void openAccount()
    {
        Customer customer = null;
        boolean exit = false;
        System.out.println("Are you a new customer?\n1) Yes\n2) No");

        while (!exit) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                customer = createNewCustomer();
                exit = true;
            }
            else if (input == 2)
            {
                System.out.println("Please enter PIN number:");
                int pinNumber = Integer.parseInt(scanner.nextLine());
                customer = bank.getCustomer(pinNumber);
                if (customer == null)
                {
                    System.out.println("Invalid PIN Number");
                    runMenu();
                }
                else
                {
                    exit = true;
                }
            } else
            {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Enter Initial Deposit Amount:");
        double initialDeposit = Double.parseDouble(scanner.nextLine());
        Account account = new Account(initialDeposit);
        customer.addAccount(account);
        System.out.printf("New Account Opened\nAccount Number: %d",account.getAccountNumber());
        runMenu();
    }

    private Customer createNewCustomer()
    {
        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter PIN Number:");
        int pinNumber = Integer.parseInt(scanner.nextLine());

        Customer customer = new Customer(firstName,lastName,pinNumber);
        bank.addCustomer(customer);
        return customer;
    }

    private void closeAllAccounts()
    {
        System.out.println("Please Enter PIN Number");
        int pinNumber = Integer.parseInt(scanner.nextLine());
        Customer customer = bank.getCustomer(pinNumber);
        if(customer == null)
        {
            System.out.println("Invalid PIN Number");
            runMenu();
        }
        else
        {
            bank.removeCustomer(customer);
            System.out.println("Customer Successfully Removed from Bank's Registry");
        }
        runMenu();
    }
}
