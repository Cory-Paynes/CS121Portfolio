package projectOne;
import java.util.Scanner;
import java.util.Random;
public class CharacterBattle
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Random rdm = new Random();

        int atk;
        int w = 0;

        // player's info
        String[] name = new String[2];
        int[] HP = new int[2];
        String[] move = new String[2];
        int[] pwr = new int[2];
        int[] spd = new int[2];
        int[] win = {0,0};

        System.out.println("Enter odd number of rounds:");
        int rounds = Integer.parseInt(scn.nextLine());

        for (int i=1; i<=rounds; ++i)
        {
            boolean end = false;
            int randNum = rdm.nextInt(2);
            System.out.printf("\nRound %d\n----------\n",i);

            for (int x=0; x<2; ++x)
            {
                System.out.printf("\nPlayer %d: Select a character and enter its stats.\n\n",x+1);
                System.out.println("Enter name:");
                name[x] = scn.nextLine();

                System.out.println("Enter HP:");
                HP[x] = Integer.parseInt(scn.nextLine());

                System.out.println("Enter move name:");
                move[x] = scn.nextLine();

                System.out.println("Enter move's power:");
                pwr[x] = Integer.parseInt(scn.nextLine());

                System.out.println("Enter attack speed:");
                spd[x] = Integer.parseInt(scn.nextLine());

            }
            //find turn order
            if (spd[0] > spd[1])
            {
                atk = 1;
            }
            else if (spd[1] > spd[0])
            {
                atk = 2;
            }
            else
            {
                atk = randNum;
            }
            outerLoop:
            while(!end)
                switch (atk) {
                    case 1:
                        //player 1 atk first
                        HP[1] = HP[1] - pwr[0];
                        if(HP[1] <= 0)
                        {
                            end = true;
                            w = 0;
                            break outerLoop;
                        }
                        HP[0] = HP[0] - pwr[1];
                        if(HP[0] <= 0)
                        {
                            end = true;
                            w = 1;
                            break outerLoop;
                        }
                        break;

                    case 2:
                        //player 2 atk first
                        HP[0] = HP[0] - pwr[1];
                        if(HP[0] <= 0)
                        {
                            end = true;
                            w = 1;
                            break outerLoop;
                        }
                        HP[1] = HP[1] - pwr[0];
                        if(HP[1] <= 0)
                        {
                            end = true;
                            w = 0;
                            break outerLoop;
                        }
                        break;
            }
            switch (w)
            {
                case 0:
                    win[0] = win[0] + 1;
                    break;

                case 1:
                    win[1] = win[1] + 1;
                    break;
            }
            System.out.printf("Player %d %s wins this round!\n",(w+1),name[w]);
            System.out.printf("Wins:\n" +
                    "Player 1 wins: %d \n" +
                    "Player 2 wins: %d",win[0],win[1]);
        }
        int winner;
        if(win[0] > win[1])
        {
            winner = 1;
        }
        else
        {
            winner = 2;
        }
        System.out.printf("Final Scores:\n" +
                "Player 1 wins: %d\n" +
                "Player 2 wins: %d\n" +
                "Player %d has won the game!", win[0],win[1],winner);
    }
}
