package weekSeven.ActivityFifteen;
import java.util.Random;
public class ClassTwo
{
    private int triangle = 0;
    private int side1;
    private int side2;
    private int side3;
    private String triangleName= " ";

    public void calcTriangle()
    {
        Random random = new Random();
        triangle = random.nextInt(3);
        side1 = random.nextInt(30) + 30;

        switch (triangle)
        {
            case 0:
                triangleName = "Scalene";
                side2 = side1 + 13;
                side3 = side1 - 13;
                break;

            case 1:
                triangleName = "Isosceles";
                side2 = side1;
                side3 = side1 + 12;
                break;

            case 2:
                triangleName = "Equilateral";
                side2 = side1;
                side3 = side1;
                break;
        }
    }
    public void displayTriangle()
    {
        System.out.printf("Triangle type: %s\n" +
                "Length of side 1: %d\n" +
                "Length of side 2: %d\n" +
                "Length of side 3: %d\n",triangleName,side1,side2,side3);
    }

}
