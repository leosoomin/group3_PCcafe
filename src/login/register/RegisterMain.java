package login.register;

import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginURL;

public class RegisterMain {
	public void Register(Parent root) {
		Stage st = (Stage)root.getScene().getWindow();
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/Register.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();

			RegisterController rc = loader.getController();
			rc.setRoot(root);

		}catch(Exception e) {

		}
		Scene sc = new Scene(root);
		st.setScene(sc);
		st.show();
	}

}
