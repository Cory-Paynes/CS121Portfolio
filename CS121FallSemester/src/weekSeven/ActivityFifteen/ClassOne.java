package weekSeven.ActivityFifteen;

public class ClassOne
{
    private String name = "Chris";
    private int fruit = 700;
    private int years = 3;
    private double totFruit;

    public void calcFruit()
    {
        int temp = fruit * years;
        totFruit = (double) temp / 4.0;
    }
    public void display()
    {
        System.out.printf("In %d years, Farmer %s picked %.2f fruits during harvest season.\n\n",years,name,totFruit);
    }
}
