package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 이예나
 * 내용 : PreparedUpdate 실습하기
 */

public class PreparedUpdateTest {

	public static void main(String[] args) {
		
		//DB정보
		 String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		 String user = "root";
		 String pass = "1234";
		 
		 try {
			 
			 //1단계 - JDBC 드라이버 로드
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 //2단계 - 데이터 베이스 접속
			 Connection conn = DriverManager.getConnection(host, user, pass);
			 
			 //3단계 - SQL 실행 객체 생성 및 맵핑
			 String sql = "UPDATE `User1` SET `hp`=?, `age`=? where `uid`=?";
			 PreparedStatement psmt = conn.prepareStatement(sql);
			 psmt.setString(1, "010-1234-1005");
			 psmt.setInt(2, 35);
			 psmt.setString(3, "A102");
			 //4단계 - SQL 실행
			 psmt.executeUpdate();
			 
			 //5단계 - 결과처리(SELECT경우)
			 
			 
			 //6단계 - 데이터 베이스 종료
			 psmt.close();
			 conn.close();
			 
		 }catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		 System.out.println("Update 완료...");
	}
}
