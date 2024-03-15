package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import login.register.R_DTO;

public class LoginDAO {
	Connection con;
	PreparedStatement pr;
	ResultSet re;
	
	public LoginDAO() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "c##lee", pw = "1111"; 
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public LoginDTO getUser(String Loginid) {
		LoginDTO dto = null;
		String sql = "select*from PCcafeMember where id=?";
		
		try {
		pr = con.prepareStatement(sql);
		pr.setString(1, Loginid);
		re = pr.executeQuery();
			if(re.next()) {
				dto = new LoginDTO(re.getString("name"), re.getString("phone"), re.getString("id"), re.getString("pw"), re.getString("time"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	

	
	

}
