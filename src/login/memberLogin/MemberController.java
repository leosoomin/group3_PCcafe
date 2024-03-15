package login.memberLogin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import login.LoginController;
import login.LoginMain;
import login.LoginServiceImpl;
import login.LoginURL;

public class MemberController implements Initializable{
	@FXML public Label MemName;
	@FXML public Label MemNumber;
	@FXML public Label MemTime;
	@FXML public Button LogoutFunc;
	
	Parent root;
	ML_ServiceImpl ls;
	ML_DTO dto;
	public void setDto( ML_DTO dto) {
		this.dto = dto;
	}
	
	/*
	 LogoutFunc > 회원로그인 성공 후 로그아웃 버튼
	 MChargeTimeFunc > 회원로그인 성공 후 시간충전 버튼
	 GoToMainFunc > 회원로그인 성공 후 메인화면가기 버튼
	 */
	public void setRoot(Parent root) {
		ls.setRoot(root);
		this.root = root;
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new ML_ServiceImpl();
		System.out.println("회원로그인 초기화");
		
	}
	public void LogoutFunc() {
		System.out.println("회원로그인 로그아웃 실행");
		//LogoutFunc.setOnAction(e->window.setScene(lsim.LConfirmFunc(null, null, root)));
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
		
		ls.LogoutFunc();
		
		//lc.LConfirmFunc();
		
	}
	public void MChargeTimeFunc() {
		System.out.println("회원로그인 시간충전 실행");
		//ls.MChargeTimeFunc();
		
	}
	public void GoToMainFunc() {
		System.out.println("회원로그인 메인화면가기 실행");
		//ML_DTO dto = new ML_DTO();
		//System.out.println("멤버로그인>메인화면갈때 dto.getMemID : "+dto.getMemID());
		String id = dto.getMemID();
		//System.out.println("멤버로그인>메인화면갈때 id : "+id);
		ls.GoToMainFunc(id);
	}
 
}
