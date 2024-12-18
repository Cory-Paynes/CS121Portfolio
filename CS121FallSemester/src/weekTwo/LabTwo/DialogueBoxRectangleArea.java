package weekTwo.LabTwo;
import javax.swing.JOptionPane;
public class DialogueBoxRectangleArea
{
    public static void main(String[] args)
    {
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));

        double area = width * height;

        JOptionPane.showMessageDialog(null,"Area: " + area);
    }
}
