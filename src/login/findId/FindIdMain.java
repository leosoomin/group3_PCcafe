package login.findId;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginURL;

public class FindIdMain {
	public void FindID(Parent root) {
		Stage st = (Stage)root.getScene().getWindow();
		
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/FindID.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			FindIdController fic = loader.getController();
			fic.setRoot(root);
			
		}catch(Exception e) {
			
		}
		Scene sc = new Scene(root);
		st.setScene(sc);
		st.show();
		
	}

}
