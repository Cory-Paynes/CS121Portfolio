package weekTwo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ActivityOneDialog
{
    // Shortcut main + tab
    public static void main(String[] args)
    {
        // A - total money in account after interest
        // P - principal amount
        // r - annual interest rate
        // n - times per yest that interest is compounded
        // t - specified number of years

        // Declare variables
        double P,r,A;
        int n,t;

        // Prompt user
        // sout - System.out,println()
        // "Enter in the principal amount: ";
        P = Double.parseDouble(JOptionPane.showInputDialog("Enter in the principal amount: ")); //2000
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate: "))/100; //8
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of times per year the interest is compounded: ")); //12
        t = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number years: ")); //5
        // scn.nextDouble(); or Double.parseDouble(scn.nextLine());
        // scn.nextInt(); or Integer.parseInt(scn.nextLine());


        // A = P ( 1 + r/n ) ^ nt
        A = P * Math.pow((1 + r/n), n*t);

        // souf
        // %s - string
        // %f - float -> %.2f = 5.334 -> 5.33
        // %d - integer
        // %c - character
        JOptionPane.showMessageDialog(null,String.format("The balance" + " of the account after %d years is $%.2f",t,A));

    }
}
