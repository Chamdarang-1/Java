package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedInsertTest {

	public static void main(String[] args) {
		
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "joseph8034";
		final String PASS = "1234";
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// SQL 실험객체 생성(PreparedStatement)
			String sql = "INSERT INTO USER1 VALUES (?,?,?,?)"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리) 왜쓰는 거임?
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 각 쿼리 파라미터를 바인딩
			psmt.setString(1, "P101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);
			
			// 실행 
			psmt.executeUpdate(); // INSERT, DELETE, UPDATE는 executeUpdate()로..
			
			psmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}
