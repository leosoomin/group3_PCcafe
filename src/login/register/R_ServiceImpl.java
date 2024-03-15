package login.register;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import login.Common;
import login.LoginController;
import login.LoginURL;

public class R_ServiceImpl implements R_Service{
	TextField Name, Phone, ID, PW, PwCheck;
	R_DAO dao;
	R_DTO dto;
	Parent root;
	public R_ServiceImpl() {
		dao = new R_DAO();
	}
	public void setRoot(Parent root ) {
		this.root = root;
	}

	int idchk = 0;

	@Override
	public int IdCheckFunc() {
		ID = (TextField)root.lookup("#ID");

		dto = new R_DTO();
		dto.setID(ID.getText());

		int num = dao.IdCheck(dto);
		String str = null;
		if(num == 1) {
			str = "중복된 아이디로 사용할 수 없습니다. 다시 입력해주세요";
			System.out.println(str);
			idchk = 0;
			ID.requestFocus();
		}else {
			str = "사용가능한 아이디입니다";
			System.out.println(str);
			idchk = 1;
		}
		Common.myAlert(str);
		return idchk;
	}

	@Override
	public void RegisterFunc() {
		Name = (TextField)root.lookup("#Name");
		Phone = (TextField)root.lookup("#Phone");
		ID = (TextField)root.lookup("#ID");
		PW = (TextField)root.lookup("#PW");
		PwCheck = (TextField)root.lookup("#PwCheck");

		String str = null;
		if(Name.getText().isEmpty()) {
			str = "이름을 입력해주세요";
			System.out.println(str);
			Name.requestFocus();
		}else if(Phone.getText().isEmpty()) {
			str = "전화번호를 입력해주세요";
			System.out.println(str);
			Phone.requestFocus();
		}else if(ID.getText().isEmpty()) {
			str = "아이디를 입력해주세요";
			System.out.println(str);
			ID.requestFocus();
		}else if(idchk != 1) {
			str = "아이디 중복체크를 해주세요";
			System.out.println(str);
			ID.requestFocus();
		}else if(PW.getText().isEmpty()) {
			str = "비밀번호를 입력해주세요";
			System.out.println(str);
			PW.requestFocus();
		}else if(PwCheck.getText().isEmpty()) {
			str = "비밀번호 확인이 필요합니다";
			System.out.println(str);
			PwCheck.requestFocus();
		}else if(!PW.getText().equals(PwCheck.getText())) {
			str = "비밀번호 확인이 실패했습니다. 다시 입력해주세요";
			System.out.println(str);
			PwCheck.requestFocus();
		}else{
			dto = new R_DTO();
			dto.setName(Name.getText());
			dto.setPhone(Phone.getText());
			dto.setID(ID.getText());
			dto.setPW(PW.getText());

			int num = dao.register(dto);
			if(num == 1) {
				str = "회원가입이 완료되었습니다";
				System.out.println(str);
			}else {
				str = "문제 발생 : 회원가입이 완료되지 않았습니다";
				System.out.println(str);
			}
			
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
		Common.myAlert(str);
	}


@Override
public void RCancelFunc() {
	System.out.println("회원가입 취소");

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

}

