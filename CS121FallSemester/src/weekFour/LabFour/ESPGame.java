package weekFour.LabFour;
import java.util.Random;
import java.util.Scanner;
public class ESPGame
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);

        int num;

        String colorCpu = "";
        String color = "";
        int turn;
        int i;
        int correct = 0;

        for (i=0; i<10; ++i)
        {
            num = random.nextInt(5);
            switch (num)

            {
                 case 0:
                    colorCpu = "red";
                    break;

                case 1:
                    colorCpu = "green";
                    break;

                case 2:
                    colorCpu = "blue";
                    break;

                case 3:
                    colorCpu = "orange";
                    break;

                case 4:
                    colorCpu = "yellow";
                    break;
            }


            turn = i + 1;
            System.out.println(turn + ". What color has the computer chosen?");
            color = scn.nextLine();

            System.out.println("> The computer chose " + colorCpu + ".\n");

            if (color.equals(colorCpu))
            {
                correct = correct + 1;
            }

        }
        System.out.printf("You got %d out of 10 correct.",correct);
    }
}
