package login.nonMember;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginURL;

public class NonMemberMain {
	public void NonMember(Parent root) {
		Stage st = (Stage)root.getScene().getWindow();
		
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/NonMemberLogin.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			NonMemberController nmc = loader.getController();
			nmc.setRoot(root);
			
			nmc.NonMemName.setText("Player01");
			nmc.NonMemNumber.setText("01");
			
		}catch(Exception e) {
			
		}
		Scene sc = new Scene(root);
		st.setScene(sc);
		st.show();
		
	}

}
