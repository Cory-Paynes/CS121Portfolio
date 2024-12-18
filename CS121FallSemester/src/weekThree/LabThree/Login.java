package weekThree.LabThree;

import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "abc123";
        String user = JOptionPane.showInputDialog("Enter Username:");
        String pass = JOptionPane.showInputDialog("Enter Password:");

        if (!user.equals(userName) && !pass.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Username and Password are incorrect.");
        }
        else if (user.equals(userName) && !pass.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Password is incorrect.");
        }
        else if (!user.equals(userName) && pass.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Username is incorrect.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Welcome to CS121");
        }

        System.out.println("Entered password: " + pass);
        System.out.println("Actual password: " + password);
        System.out.println("Entered username: " + user);
        System.out.println("Actual username: " + userName);
    }
}