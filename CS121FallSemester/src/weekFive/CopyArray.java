package weekFive;
import java.util.Scanner;
public class CopyArray
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int i;
        int y;
        int z;

        System.out.println("Enter number of array elements: ");
        int size = Integer.parseInt(scn.nextLine());
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] array3 = new int[size];
        int[] array4 = new int[size];
        int x = size -1;


        for (i=0; i<size; ++i)
        {
            System.out.printf("Enter array element %d: ",i);
            array1[i] = Integer.parseInt(scn.nextLine());
            array2[i] = array1[i];
            array3[i] = array1[i];
            array4[i] = array1[i];
        }


        // Square for array 3
        for (y=0; y<size; ++y)
        {
            array3[y] = array3[y] * array3[y];
        }

        // Reverse for array 4
        for (z=0; z<size; ++z)
        {
            array4[z] = array1[x];
            x = x - 1;
        }

        System.out.printf("\nArray 1\n%d %d %d %d %d\n\n", array1[0], array1[1], array1[2], array1[3], array1[4]);
        System.out.printf("Array 2 - Copy\n%d %d %d %d %d\n\n", array2[0], array2[1], array2[2], array2[3], array2[4]);
        System.out.printf("Array 3 - Squared\n%d %d %d %d %d\n\n", array3[0], array3[1], array3[2], array3[3], array3[4]);
        System.out.printf("Array 4 - Reversed\n%d %d %d %d %d\n\n", array4[0], array4[1], array4[2], array4[3], array4[4]);
    }
}
