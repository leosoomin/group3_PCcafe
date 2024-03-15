package login;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public interface Common {
	public static void myAlert(String alr) {
		Alert alert = new Alert(AlertType.INFORMATION); 
		alert.setContentText(alr);
		alert.show();
	}

	}

