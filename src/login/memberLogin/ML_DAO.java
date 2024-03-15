package login.memberLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ML_DAO<LoginDTO> {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public ML_DAO() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "c##lee", pw = "1111"; 
		
		try {
		Class.forName(driver);
		System.out.println("멤버로그인 드라이브 로드");
		con = DriverManager.getConnection(url, id, pw);
		System.out.println("멤버로그인 DB 연결");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void Memtime() {
		String sql = "select time from PCcafeMember where id=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, sql);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
