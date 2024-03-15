package main;

import java.net.URL;

import foods.main.MainClass;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import login.LoginController;
import login.LoginURL;

public class MainServiceImpl implements MainService{
	//private Main_DAO dao;
	Main_DTO dto;
	TextField pcnum, resttime, hi;
	Label MainID;
	Parent root;


	@Override
	public void setRoot(Parent root) {
		this.root = root;

	}

	//public MainServiceImpl() {
	//dao = new Main_DAO();
	//name = dto.getName();
	//name = (TextField)root.lookup("#name");

	//Main_Controller mc = new Main_Controller();
	//mc.MainID.setText(dto.getMainID());

	@Override
	public void messageFunc() {
		// TODO Auto-generated method stub

	}


	@Override
	public void orderFunc() {
		System.out.println("음식 주문쪽 실행");
		MainClass main = new MainClass();
		main.viewFx(root);

	}

	@Override
	public void endingFunc() {
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


		//Stage stage = (Stage)root.getScene().getWindow();
		//stage.close();
	}
}

