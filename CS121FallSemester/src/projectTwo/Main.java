package projectTwo;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);

       final int SIZE = random.nextInt(3,10);
       int[] testScores = new int[SIZE];
       char[] letterGrades = new char[SIZE];

       System.out.printf("Enter your %d test scores\n",SIZE);
       for(int i = 0; i < SIZE; ++i){
           System.out.printf("Enter test %d score: ",(i+1));
           testScores[i] = Integer.parseInt(scanner.nextLine());
       }

       for (int i = 0; i < SIZE; ++i)
       {
           letterGrades[i] = getLetterGrade(testScores[i]);
       }

       printGrades(testScores,letterGrades);
       printHighestScore(testScores,letterGrades);
       printLowestScore(testScores,letterGrades);
       printAverageScore(testScores,letterGrades);
    }

    private static char getLetterGrade(int testScore)
    {
        char letterGrade;

        if (testScore >= 90 && testScore <=100)
        {
            letterGrade = 'A';
        }
        else if (testScore >= 80 && testScore <=89)
        {
            letterGrade = 'B';
        }
        else if (testScore >= 70 && testScore <=79)
        {
            letterGrade = 'C';
        }
        else if (testScore >= 60 && testScore <=69)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }
        return letterGrade;
    }

    private static void printGrades(int[] testScores, char[] letterGrades)
    {
        System.out.printf("\n%-10s %s\n","Score", "Grade");
        for(int i = 0; i < testScores.length; ++i)
        {
            System.out.printf("  %-10s %s\n",testScores[i],letterGrades[i]);
        }
    }

    private static void printHighestScore(int[] testScores, char[] letterGrades)
    {
        int highScore = 0;
        System.out.print("The highest score is ");
        for (int i = 0; i < testScores.length; ++i)
        {
            if(testScores[i] > highScore)
            {
                highScore = testScores[i];
            }
        }
        System.out.println(highScore);
    }

    private static void printLowestScore(int[] testScores, char[] letterGrades)
    {
        int lowScore = 999;
        System.out.print("The lowest score is ");
        for (int i = 0; i < testScores.length; ++i)
        {
            if(testScores[i] < lowScore)
            {
                lowScore = testScores[i];
            }
        }
        System.out.println(lowScore);
    }

    private static void printAverageScore(int[] testScores, char[] letterGrades)
    {
        double avg = 0.0;
        System.out.print("Average score is ");
        for(int i = 0; i < testScores.length; ++i)
        {
            avg = avg + testScores[i];
        }
        avg = avg / testScores.length;
        System.out.print(avg);
    }
}
