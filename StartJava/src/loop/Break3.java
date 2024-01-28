package loop;	

public class Break3 {
	
	public static void main(String[] args) {	
		int sum = 0;		
		
		for( int i = 1; ; i++) { //무한반복 코드
			sum += i;
			if(sum>10) {
				System.out.println("합이 10보타 크면 종료: i=" + i + " sum=" + sum);
				break;
			}
		
		}
	}
}
