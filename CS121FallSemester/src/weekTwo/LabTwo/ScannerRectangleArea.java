package weekTwo.LabTwo;
import java.util.Scanner;
public class ScannerRectangleArea
{
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scn.nextInt();

        System.out.println("Enter height: ");
        double height = scn.nextInt();

        double area = width * height;
        System.out.println("Area: " + area);
    }
}
