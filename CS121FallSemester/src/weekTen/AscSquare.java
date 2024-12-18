package weekTen;
import java.util.Scanner;

public class AscSquare
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter size of list:");
        int i = Integer.parseInt(scn.nextLine());
        int[] nums = new int[i];
        int[] newNums = new int[i];


        for (int x = 0; x < i; ++x)
        {
            System.out.println("Enter a number: ");
            int num = 2 * Integer.parseInt(scn.nextLine());
            nums[x] = num;
        }

        for (int x = i-1; x >= 0; --x)
        {
            int highNum = 0;
            for (int y = 0; y <= x; ++y)
            {
                if (nums[y] > highNum)
                {
                    highNum = nums[y];
                }
            }
            newNums[x] = highNum;
        }

        for (int x = 0; x < i; ++x)
        {
            System.out.println(newNums[x]);

        }
    }
}
