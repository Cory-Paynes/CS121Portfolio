package weekTwelve.fileIO;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("courses.txt");
        PrintWriter output = new PrintWriter(file);
        String course;
        String credits;
        String score;

        output.printf("%s %s %s\n","Course","Credits","Score");

        for(int i=1; i<=3; ++i)
        {
            System.out.printf("Course %d",i);
            course = JOptionPane.showInputDialog("Enter name of course:");
            credits = JOptionPane.showInputDialog("Enter number of credits:");
            score = JOptionPane.showInputDialog("Enter course score:");

            output.printf("%s %s %s\n",course,credits,score);
        }
        output.close();
    }
}
