package loop.ex;

public class WhileEx3 {

	//반복문으로 1부터 max까지의 합을 계산하고 출력 sum변수, i(카운트)변수 사용
	public static void main(String[] args) {
		int max = 100;
		
		
		int sum = 0;
		int i = 1;
		while(i <= max) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
