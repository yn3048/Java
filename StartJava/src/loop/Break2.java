package loop;	

public class Break2 {
	
	public static void main(String[] args) {	
		int sum = 0;
		int i = 1;						
		
		for(; ;) { //무한반복 코드
			sum += i;
			if(sum>10) {
				System.out.println("합이 10보타 크면 종료: i=" + i + " sum=" + sum);
				break;
			}
			i++;
		}
	}
}
