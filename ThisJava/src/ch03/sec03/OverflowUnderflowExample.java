package ch03.sec03;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 오버플로우와 언더플로우  p.84
 * 
 */
public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i=0; i<5; i++) {	// {}를 5번 반복 실행
			var1++;//++ 연산은 var1의 값을 1 증가시킨다.
			System.out.println("var1: "+ var1);
		}	//오버플로우(최대값을 벗어나는 현상) 발생 int는 127을 벗어나면 -127부터 연산
		
		System.out.println("----------------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {
			var2--;	//--연산은 var2의 값을 1 감소시킨다.
			System.out.println("var2: "+ var2);
		}	//언더플로우 발생 (최소값을 벗어나는 현상) -127을 벗어나면 +127인 최대값부터 연산시작
	}
	
}
