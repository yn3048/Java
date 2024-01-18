package ch03.sec05;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 나눗셈 연산 후 NaN 과 Infinity처리  p.87
 * 
 */
public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y =0.0;
		double z =x/y;
		//double z = x%y;
		
		//잘못된 코드
		System.out.println(z + 2);
		
		//알맞은 코드
		if(Double.isInfinite(z)|| Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
	}
	
}