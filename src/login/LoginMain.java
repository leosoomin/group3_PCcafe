package login;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		//System.out.println(getClass().getResource(""));
		//  file:/D:/0_김보선_핀테크/Java/workspace-java/group3_PCcafe/bin/login/
		//System.out.println(Paths.get("").toAbsolutePath().toString());
		//  D:\0_김보선_핀테크\Java\workspace-java\group3_PCcafe
		
		URL loginurl = new URL(LoginURL.fxpath+"login/loginFX/Login.fxml");
		FXMLLoader loader = new FXMLLoader(loginurl);
		Parent root = loader.load();

		LoginController setR = loader.getController();
		setR.setRoot(root);
		
		
		Scene sc = new Scene(root);
		arg0.setScene(sc);
		arg0.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
/*
로그인 - ID,PW 각자 찾기버튼이 있고, 비회원 로그인도 있다.
회원가입란도 따로 있고, 시간충전란도 따로 있음.
로그인을 하면 선착순으로 PC번호를 부여한다.

회원가입 - 실명과 전화번호, 사용할 아이디, 비밀번화와 비밀번호 확인

ID찾기 - 이름과 전화번호를 받는다.
PW찾기 - ID와 이름, 비밀번호를 받는다.아이디 찾기 추가

*/

// 라벨의 아이디.setText(넣을 내용); >> 으로 회원이름을 fx에 출력가능

