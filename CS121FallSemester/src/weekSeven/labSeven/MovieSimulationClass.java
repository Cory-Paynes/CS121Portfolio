package weekSeven.labSeven;
import java.util.Random;
import java.util.Scanner;

public class MovieSimulationClass
{
    private static Scanner scanner = new Scanner(System.in);

    private static int ROWS = 5;
    private static int COLUMNS = 10;
    private static final String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
    private static final String[] movieTypes = {"3D", "2D", "3D", "2D"};
    private static final double[] moviePrices = {15.00, 12.00, 14.00, 12.00};
    private static final int[][] movieAvailability = new int[ROWS][COLUMNS];


    static int selectMovie()
    {
        while (true)
        {
            System.out.print("\nEnter the movie name: ");
            String selectedMovie = scanner.nextLine();
            for (int i = 0; i < movieNames.length; i++)
            {
                if (selectedMovie.equals(movieNames[i]))
                {
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }


    static void displaySelectedMovie(int index)
    {
        System.out.printf("\n%s MOVIE SELECTION %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-23s %-20s $%.2f\n", movieNames[index], movieTypes[index], moviePrices[index]);
    }


    static void displayMovieDetails()
    {
        System.out.printf("\n%s MOVIE DETAILS %s\n", "-".repeat(25), "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        for (int i = 0; i < movieNames.length; i++)
        {
            System.out.printf("Movie %d: %-16s %-20s %.2f\n", i + 1, movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }


    static void randomizeAvailability()
    {
        Random random = new Random();
        for (int i = 0; i < movieAvailability.length; i++)
        {
            for (int j = 0; j < movieAvailability[i].length; j++)
            {
                movieAvailability[i][j] = random.nextInt(2);
            }
        }
    }


    static void displaySeatAvailability()
    {
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.printf("\n%s AVAILABLE SEATS %s\n", "-".repeat(25), "-".repeat(25));
        System.out.print("\nSeating Availability: [1 = unavailable, 0 = available]\n\n  ");
        for (int col = 1; col <= movieAvailability[0].length; col++)
        {
            System.out.printf(" %d", col);
        }
        System.out.printf("\n %s\n", "-".repeat(20));
        for (int i = 0; i < movieAvailability.length; i++)
        {
            System.out.printf("%c |", rowLabel[i]);
            for (int j = 0; j < movieAvailability[i].length; j++)
            {
                System.out.printf("%d ", movieAvailability[i][j]);
            }
            System.out.println();
        }
    }


    static void selectSeats()
    {
        System.out.print("\nEnter the number of tickets you'd like to purchase: ");
        int tickets = Integer.parseInt(scanner.nextLine());
        for (int t = 1; t <= tickets; t++)
        {
            while (true)
            {
                System.out.printf("Please pick an available seat (e.g., A2) for ticket #%d: ", t);
                String seat = scanner.nextLine().toUpperCase();
                int rowIndex = seat.charAt(0) - 65;
                int seatIndex = Integer.parseInt(seat.substring(1)) - 1;
                if (movieAvailability[rowIndex][seatIndex] == 0)
                {
                    movieAvailability[rowIndex][seatIndex] = 1;
                    System.out.printf("\nYou have successfully booked seat %s\n", seat);
                    break;
                } else
                {
                    System.out.printf("\nSorry, seat %s is already booked. Try again!\n", seat);
                }
            }
        }
        System.out.println("\nAll seats are booked! Enjoy your movie!!");
    }

    static void run()
    {
        displayMovieDetails();
        int index = selectMovie();
        displaySelectedMovie(index);
        randomizeAvailability();
        displaySeatAvailability();
        selectSeats();
    }
}
