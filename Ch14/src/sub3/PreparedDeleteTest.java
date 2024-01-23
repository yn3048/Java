package sub3;

/*
 * 날짜 : 2024/01/23
 * 이름 : 이예나
 * 내용 : PreparedDelete 실습하기
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {

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
			 
			 //3단계 - SQL 실행
			 String sql = "Delete from `User1` where `uid`=?";
			 PreparedStatement pmst = conn.prepareStatement(sql);
			 pmst.setString(1, "A102");
			 
			 //4단계 - SQL 실행
			 pmst.executeUpdate();
			 
			 //5단계 - 결과처리 (SELECT 경우)
			 
			 //6단계 - 데이터 베이스 종료
			 pmst.close();
			 conn.close();
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println("delete 완료..");
	}
}












