package weekTen.activityTwentyOne.arrayListDemo;
import java.util.ArrayList;

public class SystemManagement
{
    private static ArrayList<Integer> pointList = new ArrayList<>();
    private static ArrayList<Double> percentList = new ArrayList<>();
    private static ArrayList<String> nameList = new ArrayList<>();

    public static void addItems()
    {
        //populate each array list

        //add elements to 'nameList'
        nameList.add("Brian");
        nameList.add("Carter");
        nameList.add("Zach");
        nameList.add("Sally");
        nameList.add("Zoe");
        nameList.add("Jack");

        //add elements to 'pointList'
        pointList.add(8);
        pointList.add(6);
        pointList.add(5);
        pointList.add(3);
        pointList.add(6);
        pointList.add(9);

        //add elements to 'percentList'
        percentList.add(83.65);
        percentList.add(68.36);
        percentList.add(55.79);
        percentList.add(36.85);
        percentList.add(64.44);
        percentList.add(95.39);
    }

    public static void removeItems()
    {
        //remove element from each array list

        //remove using content
        nameList.remove("Zach");

        //remove using index
        pointList.remove(4);

        //remove using either

        percentList.remove(55.79);
    }

    public static void displaySize()
    {
        //display array size
        System.out.println("Array \"nameList\" has a size of " + nameList.size());
        System.out.println("Array \"percentList\" has a size of " + percentList.size());
        System.out.println("Array \"pointList\" has a size of " + pointList.size());
        System.out.println("");
    }

    public static void displayIndex()
    {
        //display array size
        System.out.printf("\"Zoe\" is at index %d.\n",nameList.indexOf("Zoe"));
        System.out.printf("\"36.85\" is at index %d.\n",percentList.indexOf(36.85));
        System.out.printf("\"3\" is at index %d.\n",pointList.indexOf(3));
        System.out.println("");
    }

    public static void displayArray()
    {
        //display elements in nameList
        System.out.println("\nElements in NameList:");
        //display the elements in the array lists
        for(int i =0; i< nameList.size(); ++i)
        {
            System.out.println(nameList.get(i));
        }

        //display elements in pointList
        System.out.println("\nElements in pointList:");
        //display the elements in the array lists
        for(int i =0; i< pointList.size(); ++i)
        {
            System.out.println(pointList.get(i));
        }

        //display elements in percentList
        System.out.println("\nElements in percentList:");
        //display the elements in the array lists
        for(int i =0; i< percentList.size(); ++i)
        {
            System.out.println(percentList.get(i));
        }


    }
}
