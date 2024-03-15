package login.register;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController implements Initializable{
	/*
	@FXML public TextField Name;
	@FXML public TextField Phone;
	@FXML public TextField ID;
	@FXML public TextField PW;
	@FXML public TextField PwCheck;
	*/
	Parent root;
	R_ServiceImpl rs;
	public void setRoot(Parent root) {
		rs.setRoot(root);
		this.root = root;
	}

	/*기능 나열
	 IdCheck > 회원가입 중 아이디 중복 확인 링크
	 RegisterFunc > 회원가입 중 완료(가입) 버튼
	 RCancelFunc > 회원가입 중 취소 버튼
	 */

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		rs = new R_ServiceImpl();
		System.out.println("회원가입 초기화");

	}
	public void IdChkFunc() {
		System.out.println("회원가입 중 아이디 확인 실행");
		rs.IdCheckFunc();
	}
	public void RegisterFunc() {
		System.out.println("회원가입 완료(가입) 실행");
		rs.RegisterFunc();

	}
	public void RCancelFunc() {
		System.out.println("회원가입 취소 실행");
		rs.RCancelFunc();

	}

}
