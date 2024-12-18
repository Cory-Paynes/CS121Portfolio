package weekFive;

public class TwoDimensionalArrays {
    public static void main(String[] args)
    {
        // array 1
        int[][] array1 = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };

        // array 2
        double[][] array2 = new double[4][3];
        array2[0][0] = 1.1;
        array2[0][1] = 2.2;
        array2[0][2] = 3.3;
        array2[1][0] = 4.4;
        array2[1][1] = 5.5;
        array2[1][2] = 6.6;
        array2[2][0] = 7.7;
        array2[2][1] = 8.8;
        array2[2][2] = 9.9;
        array2[3][0] = 10.0;
        array2[3][1] = 11.1;
        array2[3][2] = 12.2;

        //array 3
        String[][] array3 = { {"Ann","Andy","Andrea"}, {"John", "Joan", "Joanna"} };

        //print arrays
        System.out.println("\nArray 1");
        for(int x = 0; x<4; ++x)
        {
            for(int y = 0; y<3; ++y)
            {
                System.out.print(array1[x][y] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\nArray 2");
        for(int x = 0; x<4; ++x)
        {
            for(int y = 0; y<3; ++y)
            {
                System.out.print(array2[x][y] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\nArray 3");
        for(int x = 0; x<2; ++x)
        {
            for(int y = 0; y<3; ++y)
            {
                System.out.print(array3[x][y] + " ");
            }
            System.out.print("\n");
        }
    }
}
