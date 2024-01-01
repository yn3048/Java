package ch02.sec02;
/*
 * p.42
 * 날짜 : 23/12/27
*/
public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 128; //컴파일 에러 127을 초과하는 수는 바이트로 변환불가함
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}
}
