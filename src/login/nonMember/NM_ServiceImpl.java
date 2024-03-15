package login.nonMember;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.LoginController;
import login.LoginURL;

public class NM_ServiceImpl implements NM_Service{

	Parent root;	
	
	public void setRoot(Parent root) {
		this.root = root;
		
	}
	@Override
	public void MTLFunc() {
		Stage st = (Stage)root.getScene().getWindow();
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/Login.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			LoginController setR = loader.getController();
			setR.setRoot(root);
			

		}catch (Exception e) {
			e.printStackTrace();
		}
		Scene sc = new Scene(root);
		st.setScene(sc);
		st.show();

		
	}

	@Override
	public void NMCTimeFunc() {
		// TODO Auto-generated method stub
		
	}


}
