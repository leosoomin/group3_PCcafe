package login;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public interface LoginService {
	public void LConfirmFunc(TextField LoginID, TextField LoginPW, Parent root);
	public void LFindIDFunc(Parent root); 
	public void LFindPWFunc(Parent root); 
	public void LRegisterFunc(Parent root); 
	public void LChargeTimeFunc(Parent root); 
	public void NonMemFunc(Parent root); 
	

}
