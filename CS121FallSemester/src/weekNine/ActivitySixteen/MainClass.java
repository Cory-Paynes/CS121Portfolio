package weekNine.ActivitySixteen;

public class MainClass {
    public static void main(String[] args) {

        //3 instances of the class
        Bank banker1 = new Bank();
        Bank banker2 = new Bank(500.50);
        Bank banker3 = new Bank("John","Smith","Checking",500.50);

        banker2.setFirstName("Jane");
        System.out.println("Banker Information: \n");
        String banker2info = String.format("First Name: %s \nInitial Deposit: $%.2f", banker2.getFirstName(), banker2.getDeposit());
        System.out.println(banker2info);
        System.out.println("\n-----------------------------------\n");
        banker2.setDeposit(250.00,"Jack");
        banker2info = String.format("First Name: %s \nInitial Deposit: $%.2f", banker2.getFirstName(), banker2.getDeposit());
        System.out.println(banker2info);
    }
}
