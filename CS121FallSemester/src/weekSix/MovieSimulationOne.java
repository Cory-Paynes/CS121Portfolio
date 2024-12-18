package weekSix;
import java.util.Scanner;
public class MovieSimulationOne
{
    static void displayMovie(String[] names,String[] types, int[] availability, double[] prices)
    {
        System.out.println("\n-------------------------------Movie Details-------------------------------");
        String header = String.format("%-20s %-20s %-20s %-20s","Movie Name","Movie Type","Available Seats","Movie Price");
        System.out.println(header);
        for(int i = 0; i < names.length; ++i)
        {
            String output = String.format("%-20s %-20s %-20d $%-20.2f",names[i],types[i],availability[i],prices[i]);
            System.out.println(output);
        }

    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        //find out array length
        System.out.println("How many movies?");
        final int num = Integer.parseInt(scn.nextLine());

        //array definitions
        String[] names = new String[num];
        String[] types = new String[num];
        int[] availability = new int[num];
        double[] prices = new double[num];

        for (int i=0; i<num; ++i)
        {
            System.out.println("\nEnter details for movie: " + (i + 1));
            System.out.println("Movie Title: ");
            names[i] = scn.nextLine();
            System.out.println("Movie Type: ");
            types[i] = scn.nextLine();
            System.out.println("Seats Available: ");
            availability[i] = Integer.parseInt(scn.nextLine());
            System.out.println("Movie Price: ");
            prices[i] = Double.parseDouble(scn.nextLine());

        }
        displayMovie(names,types,availability,prices);
    }
}
