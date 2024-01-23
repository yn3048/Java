package ch20.mysql.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 날짜 : 2024/01/23
 * 이름 : 이예나
 * 내용 : mysql 데이터 저장
 */
public class UserInsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shop", 
											   "dpsk3048", 
											   "abc1234");
			
			//매개변수화된 SQL 문 작성
			String sql = "" +
					"INSERT INTO users (custId, name, hp, addr, rdate)"
					+ "VALUES (?, ?, ?, ?, ?)";
			
			//PreparedStatement 얻기 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A101");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "010-1234-9999");
			pstmt.setString(4, "부산시 사하구");
			pstmt.setString(5, "2024-01-25");
			
			//SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			//PreparedStatement 닫기
			pstmt.close();
	
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			
		}
		
		System.out.println("실행 종료...");
	}
}





