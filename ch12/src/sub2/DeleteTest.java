package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		
		//DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "joseph8034";
		String pass = "1234";
		
		try {
			// DB 연결 
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			Statement stmt = conn.createStatement();
			
			String sql = "DELETE FROM USER1 WHERE USER_ID = 'J101'";
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
	}
}
