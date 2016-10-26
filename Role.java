
import javax.swing.JOptionPane;

/**
*@author Liz Dao
*Using switch case and joptionpane combobox
*/
public class Role {
public static void main(String[] a) {
	String[] role = { "Administrator", "Faculty", "Staff", "Student", "Guest"};
	String input = (String) JOptionPane.showInputDialog(null, "Choose one of the following", "Role of User", JOptionPane.QUESTION_MESSAGE, null, role, role[0]);
	switch(input) {
		case "Administrator":
		System.out.println("welcome ADMINISTRATOR");
		break;

		case "Faculty":
		System.out.println("Welcome FACULTY");
		break;

		case "Staff":
		System.out.println("Welcome STAFF");
		break;
		
		case "Student":
		System.out.println("Welcome STUDENT");
		break;

		case "Guest":
		System.out.println("Welcome GUEST");
		break;

		case "":
		System.out.println("You do not have permission!");
		
		break;
		default:

		}
}
}
