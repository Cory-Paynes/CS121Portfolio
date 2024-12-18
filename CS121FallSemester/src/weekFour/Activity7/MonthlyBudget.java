package weekFour.Activity7;
import java.util.Scanner;
public class MonthlyBudget
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a budget amount for the month.");
        int budget = scn.nextInt();
        boolean q = false;
        int total = 0;
        int endAmount;

        while (!q)
        {
            System.out.println("Enter an expense amount or enter \"q\" to quit.");
            String input = scn.next();

            if (input.equals("q"))
            {
                q = true;
                break;
            }
            else
            {
                int inputInt = Integer.parseInt(input);
                total = total + inputInt;
            }

        }

        System.out.println("Budget:  $" + budget + ".00");
        System.out.println("Expenses:  $" + total + ".00");
        if (budget > total)
        {
            endAmount = budget - total;
            System.out.println("Under budget by $" + endAmount);
        }
        else
        {
            endAmount = total - budget;
            System.out.println("Over budget by $" + endAmount);
        }
    }
}
