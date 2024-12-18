package weekThree;

import java.util.Objects;
import java.util.Scanner;

public class RestarauntSelector
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        boolean vegetarian;
        boolean vegan;
        boolean gluten;
        String ans1;
        String ans2;
        String ans3;

        System.out.println("Is anyone in your party vegetarian?");
        ans1 = scn.nextLine();
        if(ans1.equals("yes")) {
            vegetarian = true;
        }
        else {
            vegetarian = false;
        }

        System.out.println("Is anyone in your party vegan?");
        ans2 = scn.nextLine();
        if(ans2.equals("yes")) {
            vegan = true;
        }
        else {
            vegan = false;
        }
        System.out.println("Is anyone in your party gluten-free?");
        ans3 = scn.nextLine();
        if(Objects.equals(ans3, "yes")) {
            gluten = true;
        }
        else {
            gluten = false;
        }

        if (!vegetarian && !vegan && !gluten){
            System.out.println("Here are your restaraunt options:\n" +
                    "\tJoe’s Gourmet Burgers\n" +
                    "\tMain Street Pizza Company\n" +
                    "\tCorner Café\n" +
                    "\tMama’s Fine Italian\n" +
                    "\tThe Chef’s Kitchen");
        }
        else if (!vegetarian && !vegan){
            System.out.println("Here are your restaraunt options:\n" +
                    "\tMain Street Pizza Company\n" +
                    "\tCorner Café\n" +
                    "\tThe Chef’s Kitchen");
        }
        else if (!vegetarian && !gluten){
            System.out.println("Here are your restaraunt options:\n" +
                    "\tCorner Café\n" +
                    "\tThe Chef’s Kitchen");
        }
        else if (!vegetarian){
            System.out.println("Here are your restaraunt options:\n" +
                    "\tThe Chef’s Kitchen");
        }
        else if (!vegan && !gluten){
            System.out.println("Here are your restaraunt options:\n" +
                    "\tMain Street Pizza Company\n" +
                    "\tCorner Café\n" +
                    "\tMama’s Fine Italian\n" +
                    "\tThe Chef’s Kitchen");
        }
        else if (!vegan){
            System.out.println("Here are your restaraunt options:\n" +
                    "\tMain Street Pizza Company\n" +
                    "\tCorner Café\n" +
                    "\tThe Chef’s Kitchen");
        }
        else {
            System.out.println("Here are your restaraunt options:\n" +
                    "\tCorner Café\n" +
                    "\tThe Chef’s Kitchen");
        }
    }
}
