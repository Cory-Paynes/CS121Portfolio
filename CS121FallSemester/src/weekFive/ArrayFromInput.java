package weekFive;
import java.util.Scanner;
public class ArrayFromInput
{
    public static void main(String[] args)
    {

        Scanner scn = new Scanner(System.in);
        System.out.println("This program keeps track of minesweeper scores.");

        System.out.println("How many players?");
        int x = scn.nextInt();
        String[] name = new String[x];
        int[] time = new int[x];
        String[] diff = new String[x];
        int i;
        int n = 1;

        for (i=0; i<x; ++i)
        {
            System.out.println(n + ". Enter player name.");
            name[i] = scn.next();

            System.out.println(n + ". Enter time played in seconds.");
            time[i] = scn.nextInt();

            System.out.println(n + ". Enter difficulty played on. (Beginner, Intermediate, Expert)");
            diff[i] = scn.next();
            ++n;
        }

        System.out.println("Player \t Time \t Difficulty \n----------------------------");
        for (i=0; i<x; ++i)
        {
            System.out.println(name[i] + "\t  " + time[i] + "\t  " + diff[i]);
        }
    }
}
