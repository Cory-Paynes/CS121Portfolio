package weekSeven;
import java.util.Random;
import java.util.Scanner;
public class MovieSimulationThree
{

    static Scanner scn = new Scanner(System.in);
    static Random rdm = new Random();

    public static int selectMovie(String[] names)
    {
        boolean exit = false;
        int index = 0;
        while (!exit)
        {
            System.out.println("\nEnter the movie name you are purchasing tickets for: ");
            String movSelect = scn.nextLine();
            for (int i=0; i<names.length; ++i)
            {
                if(movSelect.equals(names[i]))
                {
                    exit = true;
                    index = i;
                }

            }
            if (exit == false)
            {
                System.out.println("Movie not found. Please try again.");
            }
        }
        return index;
    }

    public static void displaySelectedMovie(int index, String[] names, String[] types, double[] prices)
    {
        System.out.println("\n--------------------MOVIE SELECTION---------------------");
        String header = String.format("%-20s %-20s  %-20s","Movie Name","Movie Type","Movie Price");
        System.out.println(header);
        String output = String.format("%-24s %-20s $%-20.2f",names[index],types[index],prices[index]);
        System.out.println(output);
    }

    public static void displaySeatAvailability(int[][] movieAvailability,String msg)
    {
        String[] row = {"A","B", "C", "D", "E"};
        System.out.printf("\n---------------%s---------------\n\n" +
                "Seating Availability: [1 = unavailable ; 0 = available]\n\n",msg);
        System.out.println("    1  2  3  4  5  6  7  8  9  10\n" +
                "  -------------------------------");
        for (int x=0; x<5; ++x)
        {
            System.out.printf("%s | ", row[x]);
            for(int y=0; y<10; ++y)
            {
                System.out.printf("%d  ", movieAvailability[x][y]);
            }
            System.out.println("\n");
        }

    }

    public static void randomizeAvailability(int[][] movieAvailability)
    {
        for (int x=0; x<5; ++x)
        {
            for(int y=0; y<10; ++y)
            {
                movieAvailability[x][y] = rdm.nextInt(2);
            }
        }
    }

    public static void displayMovie(String[] names,String[] types, double[] prices)
    {
        System.out.println("\n--------------------MOVIE SHOWCASE---------------------");
        String header = String.format("%-20s %-20s  %-20s","Movie Name","Movie Type","Movie Price");
        System.out.println(header);
        for(int i = 0; i < names.length; ++i)
        {
            String output = String.format("%-24s %-20s $%-20.2f",names[i],types[i],prices[i]);
            System.out.println(output);
        }

    }

    public static void main(String[] args) {


        //array definitions
        String[] names = {"Jumanji", "Matrix", "Star Wars", "Spider-Man"};
        String[] types = {"2D", "3D", "2D", "3D"};
        int[][] movieAvailability = new int[5][10];
        double[] prices = {15.25, 20.15, 18.11, 19.75};

        String msgRdm = "RANDOM GENERATED SEATS";
        String msgIni = "INITIAL SEATS";

        displayMovie(names, types, prices);
        int index = selectMovie(names);
        displaySelectedMovie(index, names, types, prices);
        displaySeatAvailability(movieAvailability, msgIni);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability, msgRdm);
    }
}