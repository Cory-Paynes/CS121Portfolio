package weekTwelve.fileIO;
import java.io.*;
import javax.swing.JOptionPane;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("courses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Enter name of course:");
            String credits = JOptionPane.showInputDialog("Enter number of credits:");
            String score = JOptionPane.showInputDialog("Enter course score:");

            output.printf("%s %s %s\n", course, credits, score);
            fileWriter.close();
            output.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("File not found.");
        }
    }
}
