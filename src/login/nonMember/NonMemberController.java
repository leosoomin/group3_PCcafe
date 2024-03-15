package login.nonMember;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class NonMemberController implements Initializable{
	 @FXML public Label NonMemName;
	 @FXML public Label NonMemNumber;
	 /*
	 기능설명
	 MTLFunc > 비회원로그인중 회원로그인 버튼
	 NMCTimeFunc > 비회원로그인중 시간 충전 버튼
	 */
	Parent root;
	NM_ServiceImpl nms;
	public void setRoot(Parent root) {
		nms.setRoot(root);
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nms = new NM_ServiceImpl();
		System.out.println("비회원 로그인 초기화");
	}
	public void MTLFunc() {
		System.out.println("비회원 로그인 중 회원로그인 실행");
		nms.MTLFunc();
		
	}
	public void NMCTimeFunc() {
		System.out.println("비회원 로그인 중 시간 충전 실행");
		nms.NMCTimeFunc();
	}

}
