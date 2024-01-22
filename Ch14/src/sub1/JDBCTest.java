package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2024/01/22
 * 이름 : 이예나
 * 내용 : JDBC 실습하기
 */
public class JDBCTest {

	 public static void main(String[] args) {
		
		 // DB정보
		 String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		 String user = "root";
		 String pass = "1234";
		 
		 // JDBC 드라이버 로드
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 //데이터베이스 접속
			
		Connection conn	= DriverManager.getConnection(host,user,pass);
		
		if(conn != null) {
			System.out.println("데이터베이스 접속 성공!");
		} else {
			System.out.println("데이터베이스 접속 실패!");
		}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 System.out.println("프로그램 종료...");
		 
		 
	}
}
