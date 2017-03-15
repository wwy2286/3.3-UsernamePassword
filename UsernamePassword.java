import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import java.util.Optional;


public class UsernamePassword extends Application {
	public void start(Stage primaryStage) {
		TextInputDialog inputDialog = new TextInputDialog();
		Alert output = new Alert(AlertType.INFORMATION);
		inputDialog.setTitle("Username");
		inputDialog.setContentText("Enter Username");
		inputDialog.showAndWait();
		String username = inputDialog.getResult();
		if (username.equals("William")) {
			inputDialog.setTitle("Password");
			inputDialog.setContentText("Enter Password");
			inputDialog.showAndWait();
			String password = inputDialog.getResult();
			if (password.equals("PASSWORD")){
				output.setContentText("Welcome " + username);
				output.showAndWait();
			} else{
				output.setContentText("Wrong username and/or password");
				output.showAndWait();
				}
		}else {
		output.setContentText("Wrong username and/or password");
		output.showAndWait();
		}

	}

}
