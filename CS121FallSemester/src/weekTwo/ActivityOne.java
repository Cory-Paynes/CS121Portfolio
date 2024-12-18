package weekTwo;

import java.util.Scanner;

// Scanner
public class ActivityOne
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
        System.out.println("Enter in the principal amount: ");

        // Make scanner object
        // Declaring object
        // Creating an instance of scanner class
        Scanner scn = new Scanner(System.in);
        // scn.nextDouble(); or Double.parseDouble(scn.nextLine());
        // scn.nextInt(); or Integer.parseInt(scn.nextLine());
        P = Double.parseDouble(scn.nextLine()); // 2000
        System.out.println("Enter in the annual interest rate: ");
        r = Double.parseDouble(scn.nextLine())/100; // 8
        System.out.println("Enter in the number of times per year the interest is compounded: ");
        n = Integer.parseInt(scn.nextLine()); // 12
        System.out.println("Enter in the number years: ");
        t = Integer.parseInt(scn.nextLine()); // 5

        // A = P ( 1 + r/n ) ^ nt
        A = P * Math.pow((1 + r/n), n*t);

        // souf
        // %s - string
        // %f - float -> %.2f = 5.334 -> 5.33
        // %d - integer
        // %c - character
        System.out.printf("After %d year, you will have $%.2f",t,A);

    }
}

