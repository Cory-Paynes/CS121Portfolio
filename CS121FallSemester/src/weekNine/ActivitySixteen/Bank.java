package weekNine.ActivitySixteen;

public class Bank {
    //Instance Variables
    private String firstName, lastName, accountType;        //null
    private double deposit;                                 //0.0

    //constructors
    //default
    public Bank() {

    }

    //1 parameter
    public Bank(double deposit){
        this.deposit = deposit;
    }

    //4 parameters
    public Bank(String firstName, String lastName, String accountType, Double deposit){
        this.deposit = deposit;
        this.accountType = accountType;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit, String firstName) {
        this.deposit = deposit;
        System.out.println("The new banker is: " + firstName);
        setFirstName(firstName);
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setDeposit() {
        System.out.println("The initial deposit was $" + deposit);
    }
}
