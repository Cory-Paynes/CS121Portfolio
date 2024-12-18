package weekEleven.activityTwentyThree;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789", "Savings");

        account.addTransaction("T1001", "Deposit, $500, 01/01/2024");
        account.addTransaction("T1002", "Withdrawal, $200, 01/02/2024");
        account.addTransaction("T1003", "Deposit, $300, 01/03/2024");

        System.out.println("Initial Transactions:");

        account.displayAllReservations();
        account.removeReservation("T1002");
        account.displayAllReservations();
    }
}