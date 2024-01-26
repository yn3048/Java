package Test5;
/*
 * 
 * 파이 함수 값 구하기
 */
public class Test05 {

	public static void main(String[] args) {
		
		boolean sign = false;
		double pi = 0;
		
		for(int i = 1; i <=10000000; i +=2) { //분모 2씩증가
			
			if(!sign) { //sign이 false 이면 true 로 바꾸는 반복문 10000000이 될때까지
				pi += 1.0 /i;
				sign = true;
			}else {
				pi -= 1.0/ i;
				sign = false;
			}
			
			System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
		}
	}
}
