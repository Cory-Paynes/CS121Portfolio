package weekFour.Activity8;
import java.util.Scanner;
public class TestAverage
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int students = 0;
        int tests = 0;

        int x;
        int y;
        int score = 0;
        int totScore = 0;
        double avg;

        System.out.println("Enter number of students.");
        students = scn.nextInt();

        System.out.println("Enter number of tests per student.");
        tests = scn.nextInt();

        for (x=1; x<=students; ++x)
        {
            avg = 0;
            totScore = 0;
            System.out.println("Student number " + x + "\n--------------------");
            for (y=1; y<=tests; ++y)
            {
                System.out.println("Enter score " + y + ":");
                score = scn.nextInt();
                totScore = totScore + score;
            }
            avg = (double) totScore / tests;
            System.out.printf("The average for student %d is %.2f\n\n", x, avg);
        }
    }
}
