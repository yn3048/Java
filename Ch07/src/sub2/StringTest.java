package sub2;
/*
 * 날짜 : 2024/01/09
 * 이름 : 이예나
 * 내용 : Java String 클래스 실습 
 * 
 */
public class StringTest {

	public static void main(String[] args) {
		
		//문자열 생성
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		System.out.println("str1 : "+ str1);
		System.out.println("str2 : "+ str2);
		
		
		//문자열 비교
		if(str1 == str2) {
			System.out.println("str1 , str2 문자열이 같다.");
		}else {
			System.out.println("str1 , str2 문자열이 다르다.");
		}
		
		
		//문자열 비교할때는 equals를 사용 해야한다. String equals 에서는 문자열 끼리 비교 함
		if(str1.equals(str2)) {
			System.out.println("str1 , str2 문자열이 같다.");
		}else {
			System.out.println("str1 , str2 문자열이 다르다.");
		}
		
		
		//문자열 길이
		String msg = "Hello Korea";
		System.out.println("msg 길이 : "+ msg.length());
		
		
		//문자 추출
		char c1 = msg.charAt(0);
		char c2 = msg.charAt(6);
		
		System.out.println("msg 1번째 문자 : "+ c1);
		System.out.println("msg 7번째 문자 : "+ c2);
		
		
		//문자열 자르기
		String sub1 = msg.substring(0,5);
		String sub2 = msg.substring(6); //인덱스 번호 6번째부터 끝까지
		
		System.out.println("sub1 : "+ sub1);
		System.out.println("sub2 : "+ sub2);
		
		
		
		//문자열 인덱스
		 int idx1 = msg.indexOf("e"); //앞에서 부터 e 인덱스 번호찾기
		 int idx2 = msg.lastIndexOf("e"); //뒤에서 부터 e 인덱스 번호찾기
		 
		 System.out.println("idx1 : "+ idx1);
		 System.out.println("idx2 : "+ idx2);
		 
		 
		 //문자열 교체
		String r1 = msg.replace("Korea" , "Busan");
		String r2 = msg.replace("Hello" , "Welcome");
		
		
		System.out.println("r1 : "+ r1);
		System.out.println("r2 : "+ r2);
		
		
		
		//문자열 변환
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1); //valueOf => 정적 메소드 클래스
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;  //concat
		
		System.out.println("s1 :"+ s1);
		System.out.println("s2 :"+ s2);
		System.out.println("s3 :"+ s3);
		
		 
		
	}
	
}

















