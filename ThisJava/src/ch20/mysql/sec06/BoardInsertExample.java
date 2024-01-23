package ch20.mysql.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 이예나
 */
public class BoardInsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shop",
											   "dpsk3048", 
											   "abc1234");
			
			//매개변수화된 SQL문 작성
			String sql = "" +
					"INSERT INTO `shop` (custId, name, hp, addr, rdate)" 
					+ "VALUES(?, ?, ?, ?, now())";
			
			//PreparedStatement 얻기 및 지정
			PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "F101");
			pstmt.setString(2, "장도연");
			pstmt.setString(3, "010-1234-7777");
			pstmt.setString(4, "제주시");
			
			//SQL 문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			//bno 값 얻기
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno: " +bno);
				}
				rs.close();
			}
			
			//PreparedStatement 닫기
			pstmt.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
		  if(conn != null) {
			  try {
				  //연결 끊기
				  conn.close();
			  }catch (SQLException e) {}
		  }
		}
	}
}












