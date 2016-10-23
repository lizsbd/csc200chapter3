

import javafx.application.Application;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
*author Liz Dao
*date 10/23/2016
*CSC200 chapter 3.4
*/
public class Athlete extends Application {
@Override
public void start(Stage stage) {
	TextInputDialog ask = new TextInputDialog();
	ask.setContentText("Enter number of people");
	Optional<String> number = ask.showAndWait();
	
	int input = Integer.parseInt(number.get());

	if(input>10) {
	Alert big = new Alert(Alert.AlertType.INFORMATION);
	big.setContentText("Number of people: " + input + " and groups size : " + input/2);
	big.showAndWait();

	}
	else if (input<=10 && input>=3) {
	Alert medium = new Alert(Alert.AlertType.INFORMATION);
	medium.setContentText("Number of people: " + input + " and group size: " + input/3);
	medium.showAndWait();

	}
	else {
	Alert small = new Alert(Alert.AlertType.INFORMATION);
	small.setContentText("Number of people must be at least 3");
	small.showAndWait();
	}




}
}
