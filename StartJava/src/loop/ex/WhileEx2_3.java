package loop.ex;

public class WhileEx2_3 {

	public static void main(String[] args) {
	
		int i = 1;
		int sum =0;
		int endNum = 10; 
		
		while(i <= endNum) {
			sum = sum + i;
			System.out.println("i = " + i + ", sum = " + sum);
			i++;
		}
		
	}
}
