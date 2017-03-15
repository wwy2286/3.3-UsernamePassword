//import all classes to be used
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import java.util.Optional;
/**
* William Yu <br>
*3/14/2017 <br>
*wwy2286@gmail.com <br>
*purpose of the program: To use if and else statements <br>
*/
//creates UsernamePassword class that have attributes of application
public class UsernamePassword extends Application {
	//set the canvass for javafx
	public void start(Stage primaryStage) {
		//create new dialog box
		TextInputDialog inputDialog = new TextInputDialog();
		//create new alert type
		Alert output = new Alert(AlertType.INFORMATION);
		//set title of inputdialog box
		inputDialog.setTitle("Username");
		//set content of inputdialog box
		inputDialog.setContentText("Enter Username");
		//shows the inputdialog box
		inputDialog.showAndWait();
		//create a string named username and have it = to the user input
		String username = inputDialog.getResult();
		//if statement to see if username = to william
		if (username.equals("William")) {
			//if the above is true, prompts the user to enter a password
			inputDialog.setTitle("Password");
			inputDialog.setContentText("Enter Password");
			inputDialog.showAndWait();
			String password = inputDialog.getResult();
			//if statement to see if the password is correct
			if (password.equals("PASSWORD")){
			//if true, output Welcome "User"
				output.setContentText("Welcome " + username);
				output.showAndWait();
			//else output wrong username password
			} else{
				output.setContentText("Wrong username and/or password");
				output.showAndWait();
				}
		//if the username is incorrect, it goes to this else statement
		}else {
		output.setContentText("Wrong username and/or password");
		output.showAndWait();
		}

	}

}
