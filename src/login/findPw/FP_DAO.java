package login.findPw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FP_DAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public FP_DAO() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "c##lee", pw = "1111"; 
		try {
			Class.forName(driver);
			System.out.println("비밀번호찾기 드라이브 로드");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("비밀번호찾기 DB 연결");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String FPConfirm(FP_DTO dto) {
		String sql = "select id from PCcafeMember where name=? and phone=?";
		String result = null;
		try {
			ps = con.prepareStatement(sql);
			//ps.setString(1, dto.getPwId());
			ps.setString(1, dto.getPwName());
			ps.setString(2, dto.getPwPhone());
			rs = ps.executeQuery();

			while(rs.next()) {
				if(rs.getString("id") != dto.getPwId()) {
					result = "1";
				}else {
					result = rs.getString("pw");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
