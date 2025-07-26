package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	
	public static void main(String[] args) {
		
		//DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "joseph8034";
		String pass = "1234";
				
		Connection conn = null;
		
		try {
			// 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass); // connection은 try 안에서만 참조 가능
		
			// SQL 실행 객체 생성(Statement, PreparedStatement)
			Statement stmt= conn.createStatement();
		
			// SQL 실행
			String sql = "INSERT INTO USER1 VALUES('J101','김유신','010-1212-2221','31')";
			stmt.executeUpdate(sql);

			// 결과처리(SELECT문 일 경우)

		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
		// 데이터베이스 종료
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("INSERT 완료...");
	}
}
