/**
* @author Liz Dao
* @date 10/20/2016
* CSC200 Chapter 3.4
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;



public class Account extends Application{
@Override
public void start(Stage stage) {
	int number = 1;
	while(number < 4){
	TextInputDialog username = new TextInputDialog();
	username.setTitle("Login");
	username.setContentText("Enter your username:");
	Optional<String> name = username.showAndWait();
	
		if(name.get().equals("liz")){

		TextInputDialog password = new TextInputDialog();
		password.setTitle("Login");
		password.setContentText("Enter your password:");
		Optional<String> pass = password.showAndWait();
		
			if(pass.get().equals("186")){
			Alert welcome = new Alert(Alert.AlertType.INFORMATION);
			welcome.setTitle("Login");
			welcome.setContentText("Welcome " + name.get());
			welcome.showAndWait();
			number = number + 3;
			}
			else {
			Alert warning = new Alert(Alert.AlertType.INFORMATION);
			warning.setTitle("Login");
			warning.setContentText("Invalid Password! Please enter your username and password again!");
			warning.showAndWait();
			number++;
			}
		}
		
		else {
		Alert wrong = new Alert(Alert.AlertType.INFORMATION);
		wrong.setTitle("Login");
		wrong.setContentText("Invalid Username! Please enter your username and password again!");
		wrong.showAndWait();
		number++;
		}
	 }
	 if(number>=4){
	 Alert lock = new Alert(Alert.AlertType.INFORMATION);
	 lock.setTitle("Login Failed");
	 lock.setContentText("The account is locked! Please contact administration!");
	 lock.showAndWait();
}

	}
	}
