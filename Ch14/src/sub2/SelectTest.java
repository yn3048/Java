package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/01/22
 * 이름 : 이예나
 * 내용 : Select 실습하기
 */


public class SelectTest {

	public static void main(String[] args) {
		
		
		//DB정보
		 String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		 String user = "root";
		 String pass = "1234";
		 
		 
		 //결과처리용 리스트
		 List<User1> users = new ArrayList<>();
		 
		 try {
			 //1단계 -JDBC 드라이버 로드
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 
			 //2단계 -JDBC 데이터베이스 접속
			 Connection conn = DriverManager.getConnection(host, user, pass); //정적 메서드, 클래스메서드, static 메서드
			 
			 //3단계 -JDBC SQL 실행 객체 생성
			 Statement stmt = conn.createStatement();
			 
			 //4단계 -JDBC SQL 실행
			 String sql = "select * from `User1`";
			 ResultSet rs = stmt.executeQuery(sql);
			 
			 //5단계 -JDBC 결과 처리(SELECT 경우)
			 while(rs.next()) {
				 
				String uid 	= rs.getString(1);
				String name = rs.getString(2);
				String hp 	= rs.getString(3);
				int    age 	= rs.getInt(4);
				
				
				User1 u1 = new User1();
				u1.setUid(uid);
				u1.setName(name);
				u1.setHp(hp);
				u1.setAge(age);
				
				users.add(u1);
				
				
				//System.out.printf("%s, %s, %s, %d\n", uid, name, hp, age);
			 }
			 
			 //6단계 -JDBC 데이터베이스 종료
			 rs.close();
			 stmt.close();
			 conn.close();
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 //리스트 출력
		 for(User1 u1 : users) {
			 System.out.printf("%s, %s, %s, %d\n",  u1.getUid(),
					 								u1.getName(),
					 								u1.getHp(),
					 								u1.getAge());
		 }
		 
		 System.out.println("Select 완료...");
		
	}
}










