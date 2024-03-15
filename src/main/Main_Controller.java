package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.MainServiceImpl;

public class Main_Controller implements Initializable{
	@FXML public Button m_button, o_button, e_button; // 순서대로 메시지,음식주문,종료 버튼
	@FXML public TextField pcnum, resttime, hi; // 순서대로 이름, pc번호, 남은시간, 상단출력메시지
	@FXML public Label MainID;
	

	Parent root;
	MainServiceImpl ml;
	public void setRoot(Parent root) {
		ml.setRoot(root);
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ml = new MainServiceImpl();
		System.out.println("메인화면 초기화");
	}
	
	public void messageFunc() {
		ml.messageFunc();
	};
	public void orderFunc() {
		ml.orderFunc();
	};
	public void endingFunc() {
		ml.endingFunc();
	};

}
