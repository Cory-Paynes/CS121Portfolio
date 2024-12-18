package weekThree.LabThree;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int side1;
        int side2;
        int side3;

        System.out.println("Enter the length of side 1.");
        side1 = scn.nextInt();

        System.out.println("Enter the length of side 2.");
        side2 = scn.nextInt();

        System.out.println("Enter the length of side 3.");
        side3 = scn.nextInt();

        if ((side1 == side2) && (side2 == side3))
        {
            System.out.println("Your triangle is Equilateral.");
        }
        else if ((side1 == side2) && (side2 != side3))
        {
            System.out.println("Your triangle is Isosceles.");
        }
        else if ((side2 == side3) && (side1 != side2))
        {
            System.out.println("Your triangle is Isosceles.");
        }
        else if ((side1 == side3) && (side1 != side2))
        {
            System.out.println("Your triangle is Isosceles.");
        }
        else
        {
            System.out.println("Your triangle is Scalene.");
        }

    }
}
