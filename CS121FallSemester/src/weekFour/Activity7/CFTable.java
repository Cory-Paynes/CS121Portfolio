package weekFour.Activity7;

public class CFTable
{
    public static void main(String[] args)
    {
        int i;

        System.out.println("Celsius \t Fahrenheit");
        System.out.println("-----------------------");
        for(i=0; i<=20; ++i)
        {
            double F = (((double) 9 / 5) * i) + 32;
            System.out.printf("%d \t \t \t %.1f \n",i ,F);
        }
    }
}
