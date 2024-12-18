package weekTwo;
import javax.swing.JOptionPane;
public class WordGame
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name.");
        String age = JOptionPane.showInputDialog("Enter your age.");
        String city = JOptionPane.showInputDialog("Enter a city.");
        String school = JOptionPane.showInputDialog("Enter a college.");
        String job = JOptionPane.showInputDialog("Enter a profession.");
        String animal = JOptionPane.showInputDialog("Enter an animal.");
        String pet = JOptionPane.showInputDialog("Enter a pet name.");

        //Prompt user


        System.out.printf("Life was simple for %s. Wake up, attend class at %s, go to work, and sleep.\n" +
                "It was the same routine day in and day out. Somehow, despite their introverted lifestyle, \n" +
                "the whole city of %s knew who they were. Last year the everyone helped celebrate their %s"+ "th " +"birthday. \n" +
                "Of course this meant nothing to them, anyone who knew anything about them would know \n" +
                "that the only thing they wanted in life was to travel the world with their pet %s, %s. \n" +
                "Yet, they were stuck working part time as a %s. Thus the cycle continues...",name,school,city,age,animal,pet,job);

    }
}
