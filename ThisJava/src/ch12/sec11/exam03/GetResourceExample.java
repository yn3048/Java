package ch12.sec11.exam03;


/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 리소스 경로 얻기 p.553
 */


public class GetResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
