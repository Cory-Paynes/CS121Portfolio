package weekTwo;
import javax.swing.JOptionPane;
public class TestScores
{
    public static void main(String[] args)
    {
        String grade = "";
        int score1;
        int score2;
        int score3;
        int score;

        score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Test Score 1: "));
        score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Test Score 2: "));
        score3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Test Score 3: "));

        score = (score1 + score2 + score3)/3;

        if((score >= 90)&&(score <= 100))
        {
            grade = "A";
        }
        else if((score >= 80)&&(score < 90))
        {
            grade = "B";
        }
        else if((score >= 70)&&(score < 80))
        {
            grade = "C";
        }
        else if((score >= 60)&&(score < 70))
        {
            grade = "D";
        }
        else if(score < 60)
        {
            grade = "F";
        }
        JOptionPane.showMessageDialog(null,"The average test score is: " + score + "\n The average grade is a " + grade + ".");
    }
}
