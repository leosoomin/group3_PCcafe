package login.findPw;

import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginURL;

public class FindPwMain {
	public void FindPW(Parent root) {
		Stage st = (Stage)root.getScene().getWindow();
		
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/FindPW.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			FindPwController fpc = loader.getController();
			fpc.setRoot(root);
			
		}catch(Exception e) {
			
		}
		Scene sc = new Scene(root);
		st.setScene(sc);
		st.show();
		
	}
}
