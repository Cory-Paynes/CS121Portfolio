package weekSix.labSix;
import java.util.Scanner;
public class Rectangle
{
    static Scanner scanner = new Scanner(System.in);

    public static double getLength()
    {
        double length;
        System.out.println("Enter the length of a rectangle:");
        length = Double.parseDouble(scanner.nextLine());
        return length;
    }

    public static double getWidth()
    {
        double width;
        System.out.println("Enter the width of a rectangle:");
        width = Double.parseDouble(scanner.nextLine());
        return width;
    }

    public static double getArea(double length, double width)
    {
        double area;
        area = length * width;
        return area;
    }

    public static void displayData(double length, double width, double area)
    {
        System.out.printf("Rectangle length: %.2f\n" +
                "Rectangle width: %.2f\n" +
                "Rectangle area: %.2f", length, width, area);
    }

    public static void main(String[] args)
    {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width,area);

    }
}
