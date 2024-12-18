package weekOne;

public class FirstCodeWithMe
{
    public static void main(String[] args)
    {
        //declare variables
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;

        //initialize variables
        age = 20;
        gpa = 5.99;
        name = "Cory";
        letterGrade = 'A';
        csMajor = true;
        String favoriteColor = "Purple";

        //print
        //println
        //printf - formatting

        System.out.printf("The age of this person is: %d%n ---------",age);
        System.out.printf("The gpa is %.3f%n",gpa);
        System.out.printf("The letter grade is : %c%n",letterGrade);
        System.out.printf("Is it true that your major is Computer Science? %b%n",csMajor);
        System.out.printf("This persons name is %s%n",name);

        System.out.println("Your age is: " + age);
    }
}
