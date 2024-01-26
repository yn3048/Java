package Test1;
/*
 * 날짜 : 2023/12/28
 */
public class Test03 {
	public static void main(String[] args) {
		int result = 0;
		int num =1;
	
		
		result = num++; //대입 후 증가
		System.out.println("result : " +result);
		
		result = ++num; //증가 후 대입
		System.out.println("result : " +result);
		
		result = num--;
		System.out.println("result : " +result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
