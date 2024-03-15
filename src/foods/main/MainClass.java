package foods.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass {
	/*
	public void start(Stage arg0) throws Exception {
		Parent root = null;
		Stage mainStage = new Stage();
		try {
			FXMLLoader loader = new FXMLLoader( getClass().getResource("Foods_List.fxml") );
			
			root = loader.load();
		} catch(Exception e) {
			e.printStackTrace();
		}		
		Scene scene = new Scene(root);
		mainStage.setScene(scene);
		mainStage.show();
	}
	*/
	public void viewFx(Parent root) {
		Stage foodStage = (Stage)root.getScene().getWindow();
		try {
			FXMLLoader loader = new FXMLLoader( getClass().getResource("Foods_List.fxml") );
			root = loader.load(); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		foodStage.setScene(scene);
		foodStage.show();
	}
	
}

