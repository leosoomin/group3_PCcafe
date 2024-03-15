package foods.main;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import foods.main.*;

public class OrderController implements Initializable{
	@FXML public TextArea TextArea11;
	@FXML public TextField TextField11;
	
	Parent root;
	String path;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		FXMLLoader loader = new FXMLLoader( getClass().getResource("Order_List.fxml") );

		
		//Stage OrderStage = (Stage)root.getScene().getWindow();
		
		
		

	}
	
}
