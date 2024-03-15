package login.findId;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import login.Common;
import login.LoginController;
import login.LoginURL;

public class FI_ServiceImpl implements FI_Service{
	Parent root;
	FI_DAO dao;
	FI_DTO dto;
	TextField IdName, IdPhone;
	public FI_ServiceImpl() {
		dao = new FI_DAO();
	}
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void FIdConfirmFunc() {
		IdName = (TextField)root.lookup("#IdName");
		IdPhone = (TextField)root.lookup("#IdPhone");
		
		dto = new FI_DTO();
		dto.setIdName(IdName.getText());
		dto.setIdPhone(IdPhone.getText());
		
		String str = dao.FIConfirm(dto);
		String msg = null;
		if (str == null) {
			msg = "존재하지 않는 회원입니다.";
			IdName.requestFocus();
		}else {
			msg = dto.getIdName()+" 회원님의 아이디는 "+str+"입니다";
		}
		Common.myAlert(msg);
		
		

	}
	@Override
	public void FIdCancelFunc() {
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