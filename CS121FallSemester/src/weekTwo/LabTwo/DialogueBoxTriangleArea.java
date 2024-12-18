package weekTwo.LabTwo;
import javax.swing.JOptionPane;
public class DialogueBoxTriangleArea
{
    public static void main(String[] args)
    {
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));

        double area = (height * width) / 2;
        JOptionPane.showMessageDialog(null,"Area: " + area);
    }
}
