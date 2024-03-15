package login.findId;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import login.Common;

public class FI_DAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public FI_DAO() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "c##lee", pw = "1111"; 
		try {
			Class.forName(driver);
			System.out.println("아이디찾기 드라이브 로드");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("아이디 찾기 DB 연결");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String FIConfirm(FI_DTO dto) {
		String sql = "select id from PCcafeMember where name =? and phone=?";
		String result = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getIdName());
			ps.setString(2, dto.getIdPhone());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				result = rs.getString("id");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
