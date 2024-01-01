package Test1;
/*
 * 날짜 : 2023/12/28
 */
public class Test07 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			if(k%2 == 0 || k%3 ==0) {
				total += k;
			} //2의 배수이거나 3의 배수일때 k값의 합
		}
		
		System.out.println("1~10까지 2와 3배수의 합 : " +total);
	}
}
