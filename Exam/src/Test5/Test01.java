package Test5;



public class Test01 {

	public static void main(String[] args) {
		
		//char 는 int로 문자 변환 가능
		char var1 = 'A';
		int var2 = var1;
		char var3 = 'B';
		int var4 = var1 + var3;
		String var5 = """ 
				         Hello World! 
						 Hello Korea!
						 Hello Busan!
					  """;
		
		System.out.println("var1:" + var1);
		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println(var5);
		
		int a = 10;
		int b = 5;
		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);
		
		System.out.println(a > b ^ a == b); //xor연산자
		System.out.println(a > b ^ a == b);
		
				
		System.out.println(a == b & test(1)); // 뒤에 연산으로 출력  
		System.out.println(a == b && test(2)); //앞이 false면 무조건 false 출력
		
		System.out.println(b > 0 & (a / b > 0));  
		System.out.println(b > 0 && (a / b >0)); //방어코드  나누기 0 했을때 에러나는거 방지
	}
	
	public static boolean test(int n) {
		System.out.println("test(" + n +") 실행...");
		return true;
	}
}




















