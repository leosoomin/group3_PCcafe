package login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{
	@FXML public TextField LoginID;
	@FXML public TextField LoginPW;
	Parent root;
	LoginService ls;

	/* 기능 나열
	 * LConfirmFunc > 로그인 확인 버튼
	   LFindIDFunc > 로그인 화면에 있는 아이디 찾기 링크
	   LFindPWFunc > 로그인 화면에 있는 비밀번호 찾기 링크
	   LRegisterFunc > 로그인 화면에 있는 회원가입 버튼
	   LChargeTimeFunc > 로그인 화면에 있는 시간충전 버튼
	   NonMemFunc > 로그인 화면에 있는 비회원 로그인 버튼
	 */
	public void setRoot(Parent root) {
		this.root = root;

	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ls = new LoginServiceImpl();
		System.out.println("초기화 메소드");

	}
	public void LConfirmFunc() {
		System.out.println("로그인 실행");
		ls.LConfirmFunc(LoginID, LoginPW, root);
	}
	public void LFindIDFunc() {
		System.out.println("로그인 중 아이디 찾기 실행");
		ls.LFindIDFunc(root);

	}
	public void LFindPWFunc() {
		System.out.println("로그인 중 비밀번호 찾기 실행");
		ls.LFindPWFunc(root);
	}
	public void LRegisterFunc() {
		System.out.println("로그인 중 회원가입 실행");
		ls.LRegisterFunc(root);

	}
	public void LChargeTimeFunc() {
		System.out.println("로그인 중 시간충전 실행");
		ls.LChargeTimeFunc(root);

	}
	public void NonMemFunc() {
		System.out.println("비회원 로그인 실행");
		ls.NonMemFunc(root);

	}
		
}
