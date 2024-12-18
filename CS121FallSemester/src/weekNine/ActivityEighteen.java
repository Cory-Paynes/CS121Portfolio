package weekNine;

import java.util.Scanner;

public class ActivityEighteen
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = Integer.parseInt(scn.nextLine());
        int r = n % 2;
        boolean output;


        if (r == 0)
        {
            output = true;
        }
        else
        {
            output = false;
        }
        System.out.println(output);
    }
}
