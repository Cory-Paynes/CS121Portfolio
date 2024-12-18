package weekThree.LabThree;
import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int num;

        System.out.println("Enter a number.");
        num = scn.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Your number is Even.");
        }
        else
        {
            System.out.println("Your number is Odd.");

        }
    }
}
