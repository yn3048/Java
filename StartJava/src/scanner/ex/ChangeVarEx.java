package scanner.ex;

public class ChangeVarEx {

	
	//a값과 b값 교환하기
	public static void main(String[] args) {
		int a= 10;
		int b = 20;
		int temp;
		
		temp = a;   //temp에 a값 임시 보관
		a = b;
		b = temp;
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
