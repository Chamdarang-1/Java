package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SelectTest {

	public static void main(String[] args) {
		
		//DB 정보
		String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		String USER = "joseph8034";
		String PASS = "1234";
		
		// 조회결과 반환용 리스트 생성
		List <User1VO> users = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			Statement stmt = conn.createStatement();
		
			String sql = "SELECT * FROM USER1"; 
			ResultSet rs = stmt.executeQuery(sql); // SELECT 문은 executeQuery(update아님)
			
			// 결과처리 (일반적으로 리스트 생성)
			while(rs.next()) { // 커서를 다음 row로 이동시킴, 이동할 row가 없으면 false
				
				// 커서가 가리키는 Row의 각 컬럼값을 추출해서 VO객체 초기화
				//String user_id 	= rs.getString(1);
				//String name 	= rs.getString(2);
				//String hp 		= rs.getString(3);
				//int age			= rs.getInt(4);

				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1)); //user_id
				vo.setName(rs.getString(2)); //name
				vo.setHp(rs.getString(3)); // hp
				vo.setAge(rs.getInt(4)); //age
				
				// 리스트 삽입
				users.add(vo);
			}

			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 리스트 출력
		for(User1VO user: users) {
			System.out.println(user);
			
		}
		
		System.out.println("Select 완료...");
	}
}
