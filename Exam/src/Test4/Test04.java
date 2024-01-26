package Test4;

/*
 * 날짜 : 2024/01/12
 * 이름 : 이예나
 * 내용 : 자바 문자열 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf("."); // .의 위치 출력=> idx = 11
		
		String title = fileName.substring(0, idx); // 0부터 idx값인 11까지의 문자 출력 => "HelloWorld"
		String ext   = fileName.substring(idx+1); // idx 값 뒤부터 출력 => "Java"
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String   strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(","); // , 기준으로 나눔 => 60 72 82 86 92
		
		int total = 0;
		
		for(String score : scores) {
		
			total += Integer.parseInt(score.trim()); // trim: 공백 없애는 메소드
			
		}
		
		System.out.println("strScores 총점 : " + total);	
	}
}
