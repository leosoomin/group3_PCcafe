package main;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_Screen{

	
	public void Main(Parent root, String id) {
		System.out.println(11111111);
		Stage st = (Stage)root.getScene().getWindow();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("mainscreen.fxml"));
			root = loader.load();
			
			Main_Controller mc = loader.getController();
			mc.setRoot(root);
			
			mc.MainID.setText("회원ID : "+id);
			
			Main_DTO dto = new Main_DTO();
			dto.setMainID(id);
			
			//System.out.println("메인화면 넘어온후 dto.getMainID : "+dto.getMainID());
			//System.out.println("메인화면 넘어온후 컨트롤러객체 MainID : "+mc.MainID);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Scene scene = new Scene(root);				
		st.setScene(scene);
		st.show();
	}


}
