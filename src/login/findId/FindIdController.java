package login.findId;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class FindIdController implements Initializable{
	/*
	@FXML public TextField IdName;
	@FXML public TextField IdPhone;
	*/
	Parent root;
	FI_ServiceImpl fis;
	public void setRoot(Parent root) {
		fis.setRoot(root);
		this.root = root;
	/*기능 설명
	 FIdConfirmFunc > 아이디찾기 중 확인 버튼
	 FIdCancelFunc > 아이디찾기 중 취소 버튼
	 */
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fis = new FI_ServiceImpl();
		System.out.println("아이디찾기 초기화");
	}
	public void FIdConfirmFunc() {
		System.out.println("아이디찾기 확인 실행");
		fis.FIdConfirmFunc();
		
	}
	public void FIdCancelFunc() {
		System.out.println("아이디찾기 취소 실행");
		fis.FIdCancelFunc();
	}

}
