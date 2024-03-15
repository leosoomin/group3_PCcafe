package login.memberLogin;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import login.LoginController;
import login.LoginServiceImpl;
import login.LoginURL;
import main.Main_Screen;

public class ML_ServiceImpl implements ML_Service{

	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void LogoutFunc() {
		System.out.println("로그아웃 시작");
		
		//Stage st = new Stage();
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
		//lsim.LConfirmFunc(null, null, root);
		
		
	}

	@Override
	public void MChargeTimeFunc() {
		System.out.println("멤버 시간충전 시작");
		
	}

	public void GoToMainFunc(String id) {
		System.out.println("멤버 메인화면으로 가기 시작");
		
		Main_Screen ms = new Main_Screen();
		ms.Main(root, id);
		
	}

}
