package weekEleven.activityTwentyThree;

import java.util.HashMap;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private HashMap<String, String> transactionHistory;

    public BankAccount(String accountHolderName, String accountNumber, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.transactionHistory = new HashMap<>();
    }

    public void addTransaction(String transactionID, String details) {
        transactionHistory.put(transactionID, details);
    }

    public void removeReservation(String transactionID) {
        if (transactionHistory.containsKey(transactionID)) {
            transactionHistory.remove(transactionID);
            System.out.println("\nTransaction " + transactionID + " removed.\n");
        } else {
            System.out.println("Transaction not found.");
        }
    }

    public String getReservation(String transactionID) {
        return transactionHistory.getOrDefault(transactionID, "Transaction not found.");
    }

    public void displayAllReservations() {
        System.out.printf("Transaction history for Account: %s\n",accountNumber);
        for(String transactionID : transactionHistory.keySet()) {
            System.out.println("Transaction ID: " + transactionID + " | Details: " + transactionHistory.get(transactionID));
        }
    }
}
