package login.findPw;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class FindPwController implements Initializable{
	/*
	@FXML public TextField PwId;
	@FXML public TextField PwName;
	@FXML public TextField PwPhone;
	*/
	
	/*기능 설명
	 MTFIdFunc > 비밀번호찾기 중 아이디찾기로 가는 링크
	 FPwConfirmFunc > 비밀번호찾기 중 확인 버튼
	 FPwCancelFunc > 비밀번호찾기 중 취소 버튼
	 */
	Parent root;
	FP_ServiceImpl fps;
	public void setRoot(Parent root) {
		fps.setRoot(root);
		this.root = root;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fps = new FP_ServiceImpl();
		System.out.println("비밀번호 찾기 초기화");
	}
	public void MTFIdFunc() {
		System.out.println("비밀번호 찾기 중 아이디 찾기 실행");
		fps.MTFIdFunc();
		
	}
	public void FPwConfirmFunc() {
		System.out.println("비밀번호 찾기 중 확인 실행");
		fps.FPwConfirmFunc();
		
	}
	public void FPwCancelFunc() {
		System.out.println("비밀번호 찾기 중 취소 실행");
		fps.FPwCancelFunc();
		
	}
	
	
	

}
