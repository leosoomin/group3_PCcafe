package foods.main;

import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class OrderMain {
	public void viewFx(Parent root, String a, String b) {
		Stage OrderStage = new Stage();
		
		String path;
		//path = Paths.get("").toAbsolutePath().toString();
		//path += "/src/";
		
		
		
		
				
		try {
			FXMLLoader loader = new FXMLLoader( getClass().getResource("Order_List.fxml") );
			root = loader.load();
			OrderController ocl = loader.getController();
			ocl.setRoot(root);
			ocl.TextArea11.setText(a);
			ocl.TextField11.setText(b);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		OrderStage.setScene(scene);
		OrderStage.show();
		
	}
}
