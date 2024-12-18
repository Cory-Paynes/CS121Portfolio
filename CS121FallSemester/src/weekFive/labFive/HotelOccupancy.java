package weekFive.labFive;
import java.util.Scanner;
public class HotelOccupancy
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int floors;
        int room;
        int roomTot = 0;
        int roomO;
        int roomOTot = 0;
        int i;

        System.out.println("Enter number of floors");
        floors = scn.nextInt();

        for (i=1; i<=floors; ++i)
        {
            System.out.println("Enter number of rooms on floor " + i);
            room = scn.nextInt();
            roomTot = roomTot + room;

            System.out.println("How many of the floor's rooms are occupied");
            roomO = scn.nextInt();
            roomOTot = roomOTot + roomO;
        }
        int roomV = roomTot - roomOTot;
        double rate = (double) roomOTot / roomTot;
        double rateP = rate * 100;
        System.out.printf("Floors: %d\n" +
                "Rooms: %d\n" +
                "Occupied Rooms: %d\n" +
                "Vacant Rooms: %d\n" +
                "Occupancy: %.2f (%.0f%%)", floors, roomTot, roomOTot, roomV, rate, rateP);

    }
}
