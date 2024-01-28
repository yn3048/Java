package casting;

public class Casting2 {

	public static void main(String[] args) {
	
		double doubleValue = 1.5;
		int intValue = 0;
		
//		intValue = doubleValue;  컴파일 오류
		intValue = (int) doubleValue; //형(강제)변환 => 소수점 손실일어남
		System.out.println(intValue);
	}
}
