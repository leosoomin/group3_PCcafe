package login.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class R_DAO {
	Connection con;
	PreparedStatement pr;
	ResultSet re;
	
	public R_DAO() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "c##java", pw = "1234"; 
		try {
			Class.forName(driver);
			System.out.println("회원가입 드라이브 로드");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("회원가입 DB 연결");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public int register(R_DTO dto) {
		int result = 0;
		String sql = "insert into PCcafeMember(name, phone, id, pw, time) "
				+ "values(?,?,?,?,?)";
		
		try {
			pr = con.prepareStatement(sql);
			pr.setString(1, dto.getName());
			pr.setString(2, dto.getPhone());
			pr.setString(3, dto.getID());
			pr.setString(4, dto.getPW());
			pr.setString(5, dto.getTime());
			result = pr.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int IdCheck(R_DTO dto) {
		int result = 0;
		String sql = "Select id from PCcafeMember where id =?";
		try {
			pr = con.prepareStatement(sql);
			pr.setString(1, dto.getID());
			result = pr.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
