package weekTwo;

import java.util.Scanner;

public class BookClubPoints
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int points;
        int books;

        System.out.println("Number of Books: ");
        books = scn.nextInt();

        if(books == 1 )
        {
            points = 5;
        }
        else if(books == 2 )
        {
            points = 15;
        }
        else if(books == 3 )
        {
            points = 30;
        }
        else if(books >= 4 )
        {
            points = 60;
        }
        else
        {
         points = 0;
        }
        System.out.println("Customer has " + points + " points.");
    }
}
