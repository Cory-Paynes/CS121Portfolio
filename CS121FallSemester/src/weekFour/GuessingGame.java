package weekFour;
import java.util.Scanner;
public class GuessingGame
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int att = 0;
        int num = 35;
        System.out.println("Guess a number between 1 and 100, or enter \"q\" to give up:");
        String input = scn.nextLine();
        boolean q = false;


        while (!q)
        {
            att += 1;
            if (input.equals("q"))
            {
                System.out.println("Quitter! The number was " + num);
                q = true;
                break;
            }
            else{
                int inputInt = Integer.parseInt(input);
                if (inputInt > num)
                {
                System.out.println("Too High. Guess again:");
                input = scn.nextLine();
                }
                else if (inputInt < num)
                {
                System.out.println("Too Low. Guess again:");
                input = scn.nextLine();
                }
                else
                {
                    System.out.println("Correct!");
                    break;
                }
            }
        }
        System.out.println("Number of Guesses: " + att);
    }
}
