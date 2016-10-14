/**
* @author Liz Dao
* @description prompt user to login with username and password
*/

import javax.swing.*;

public class Login {
public static void main(String[] args) {
JTextField username = new JTextField(30);
JTextField password = new JPasswordField(30);

JPanel login = new JPanel();
login.add(new JLabel("Username:"));
login.add(username);
login.add(Box.createHorizontalStrut(30));
login.add(new JLabel("Password:"));
login.add(password);
login.add(Box.createHorizontalStrut(30));

int confirm = JOptionPane.showConfirmDialog(null, login, "Enter your username and password to login", JOptionPane.OK_CANCEL_OPTION);
if (confirm == JOptionPane.OK_OPTION) {
if (username.getText() == null) {
System.out.println("Wrong username or password");
}
else {
System.out.println("Welcome " + username.getText());
}

}
}
}


