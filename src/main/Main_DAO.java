package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main_DAO {
	Connection con;
	PreparedStatement pr;
	ResultSet re;

	public Main_DAO() {
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
	
	/*
	public Main_DTO getUser(String name) {
		Main_DTO dto = null;
		String sql = "select name from PCcafeMember where id =?";
		
		try {
			pr = con.prepareStatement(sql);
			pr.setString(1, dto.getName());
			re = pr.executeQuery();
				
			if(re.next()) {
					dto = new Main_DTO(re.getString("name"));
				}
				
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	*/
	
}



