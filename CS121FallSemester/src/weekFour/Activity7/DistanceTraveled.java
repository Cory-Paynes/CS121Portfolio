package weekFour.Activity7;
import java.util.Scanner;
public class DistanceTraveled
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int speed;
        int hour;
        int i;
        int dist;

        System.out.println("Enter the speed of the vehicle in mph.");
        speed = scn.nextInt();

        System.out.println("Enter the number of hours spent traveling.");
        hour = scn.nextInt();

        System.out.println("Hour \t Distance Traveled");
        System.out.println("--------------------------");
        for(i=1; i<=hour;++i)
        {
            dist = i * speed;
            System.out.println(i + "\t \t \t \t" + dist);
        }

    }
}
