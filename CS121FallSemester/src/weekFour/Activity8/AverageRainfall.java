package weekFour.Activity8;
import java.util.Scanner;
public class AverageRainfall
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int x;
        int y;
        int years;
        int rain;
        int months;
        int ovrRain = 0;
        int totRain = 0;
        double avg;

        System.out.println("Enter number of years.");
        years = scn.nextInt();

        for (x=1; x<=years; ++x)
        {
            System.out.println("\nYear " + x + "\n------");
            for (y=1; y<=12; ++y)
            {
                System.out.println("Enter amount of rain in inches for MONTH " + y + ":");
                rain = scn.nextInt();
                totRain = totRain + rain;
            }
            ovrRain = ovrRain + totRain;
        }
        months = years * 12;
        avg = (double) totRain / months;

        System.out.printf("\n\nTotal number of months: %d\n" +
                "Total inches of rain across %d years: %d\n" +
                "Average rainfall per month: %.2f",months,years,totRain,avg);
    }
}
