package login.findPw;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import login.Common;
import login.LoginController;
import login.LoginURL;
import login.findId.FI_DTO;
import login.findId.FindIdController;

public class FP_ServiceImpl implements FP_Service{

	Parent root;
	FP_DAO dao;
	FP_DTO dto;
	TextField PwId, PwName, PwPhone;
	public FP_ServiceImpl() {
		dao = new FP_DAO();
	}

	@Override
	public void setRoot(Parent root) {
		this.root = root;

	}

	@Override
	public void MTFIdFunc() {
		Stage st = (Stage)root.getScene().getWindow();
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/FindID.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			FindIdController fic = loader.getController();
			fic.setRoot(root);
			
			Scene sc = new Scene(root);
			st.setScene(sc);
			st.show();

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void FPwConfirmFunc() {
		PwId = (TextField)root.lookup("#PwId");
		PwName = (TextField)root.lookup("#PwName");
		PwPhone = (TextField)root.lookup("#PwPhone");

		dto = new FP_DTO();
		dto.setPwId(PwId.getText());
		dto.setPwName(PwName.getText());
		dto.setPwPhone(PwPhone.getText());

		
		String str = dao.FPConfirm(dto);
		String msg = null;
		if(str == "1") {
			msg = "아이디가 다릅니다. 아이디찾기를 먼저 진행해주세요";
			PwId.requestFocus();
		}else if (str == null) {
			msg = "존재하지 않는 회원입니다.";
			PwId.requestFocus();
		}else {
			msg = dto.getPwName()+" 회원님의 비밀번호는 "+str+"입니다";
		}
		Common.myAlert(msg);

	}

	@Override
	public void FPwCancelFunc() {
		Stage st = (Stage)root.getScene().getWindow();
		try {
			URL url = new URL(LoginURL.fxpath+"login/loginFX/Login.fxml");
			FXMLLoader loader = new FXMLLoader(url);
			root = loader.load();
			
			LoginController setR = loader.getController();
			setR.setRoot(root);
			
			Scene sc = new Scene(root);
			st.setScene(sc);
			st.show();

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
