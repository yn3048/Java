package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/01/22
 * 이름 : 이예나
 * 내용 : Insert 실습하기
 */

public class InsertTest {

	public static void main(String[] args) {
		
		//DB정보
		 String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		 String user = "root";
		 String pass = "1234";
		 
		 try {
			 //1단계 - JDBC 드라이버 로드
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 //2단계 - JDBC 데이터베이스 접속
			 Connection conn = DriverManager.getConnection(host, user, pass);
			 
			 //3단계 - JDBC SQL 실행 객체 생성
			 Statement stmt = conn.createStatement();
			
			 //4단계 - JDBC SQL 실행
			 String sql = "INSERT INTO `User1` VALUES ('P101', '김유신', '010-1234-1001', '23')";
			 stmt.executeUpdate(sql);
			
			 //5단계 - JDBC 결과 처리(SELECT 경우)
			 
			 //6단계 - JDBC 접속 종료
			 stmt.close();
			 conn.close();
			 
			 
		 } catch( Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println("Insert 완료...");
	}
}























