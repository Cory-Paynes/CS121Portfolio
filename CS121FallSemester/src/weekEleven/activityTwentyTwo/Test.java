package weekEleven.activityTwentyTwo;

public class Test {
    public static void main(String[] args) {
        Main main1 = new Main("Jack Lane", "Economy", 12);
        Main main2 = new Main("Lily Jones", "Business", 22);

        main1.addEntry("Transaction 1: Paid $300");
        main1.addEntry("Transaction 2: Seat upgraded to Business");
        main1.addEntry("Transaction 3: Meal preference selected");

        main2.addEntry("Transaction 1: Paid $250");
        main2.addEntry("Transaction 2: Special meal requested");
        main2.addEntry("Transaction 3: Seat upgraded to First Class");

        main1.getInfo();
        main2.getInfo();

        main1.removeEntry();
        main2.removeEntry();

        main1.displayEntries(1);
        main2.displayEntries(2);
    }
}
