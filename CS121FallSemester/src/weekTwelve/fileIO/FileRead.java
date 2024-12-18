package weekTwelve.fileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileRead {
    public static void main(String[] args) {
        File file = new File("courses.txt");

        try {
            Scanner scn = new Scanner(file);
            while(scn.hasNextLine())
            {
                String line = scn.nextLine();
                System.out.print(line);
            }
            scn.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}