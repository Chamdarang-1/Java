package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

public class PreparedSelectTest {
	
	public static void main(String[] args) {
		
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "joseph8034";
		final String PASS = "1234";
		
		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<User1VO>();
		
		try {
			// DP 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//SQL 실험객체 생성(PreparedStatement)
			String sql = "SELECT * FROM USER1 WHERE AGE >= ? ";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 20); // 1번째 쿼리파라미터(?)에 나이 숫자 20바인딩
			
			//SQL 실행
			ResultSet rs = psmt.executeQuery(); // SELECT 실행 = QUERY
			
			
			//결과처리(SELECT 경우)(while에 if를 넣는다면?) (쿼리문 조회 건수에 따라서 if나 while을 쓴다)
			while(rs.next()) {
				
				// VO 객체 생성 : VO 객체는 DB에서 조회된 결과로 초기화된 읽기 전용 오브젝트(객체)
				User1VO vo =new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
				
			}
			
			rs.close();
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		for(User1VO user : users) {
			System.out.println(user);
		}
		
		System.out.println("SELECT 완료...");
	}

}
