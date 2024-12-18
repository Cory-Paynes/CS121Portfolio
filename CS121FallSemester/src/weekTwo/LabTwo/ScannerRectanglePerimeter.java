package weekTwo.LabTwo;
import java.util.Scanner;
public class ScannerRectanglePerimeter
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scn.nextInt();

        System.out.println("Enter height: ");
        double height = scn.nextInt();

        double perim = (height * 2) + (width * 2);

        System.out.println("Perimeter: " + perim);
    }
}
