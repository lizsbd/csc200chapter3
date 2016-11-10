import javafx.application.Application;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.stage.Stage;


public class star extends Application {
@Override
public void start( Stage stage) throws Exception {
	int i = 1;
	int left = 2;
	int right =3;
	StringBuffer last = new StringBuffer("\t\n");
	StringBuffer a = new StringBuffer("*");
	StringBuffer input = new StringBuffer("     ");
	while(i<=3) {
	input.replace(left,right,a.toString());
	i++;
	left--;
	right++;
	a.append("**");	
	last.append(input.toString()).append("\n");
		}
	
	String upsidedown = new String(last.toString());
	last.reverse().delete(0, 7);
	Alert picture = new Alert(AlertType.INFORMATION);
	picture.setTitle("Diamond Diagram");
	picture.setContentText(upsidedown.concat(last.toString()));
	picture.showAndWait();

}
}

