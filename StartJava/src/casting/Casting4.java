package casting;

public class Casting4 {

	public static void main(String[] args) {
		int div1 = 3 / 2;  // int / int 이므로 결과값도 int
		System.out.println("div1 = " + div1);
		
		double div2 = 3 / 2;  // int / int 이므로 결과값 int
		System.out.println("div2 = " + div2);
		
		double div3 = 3.0 / 2; // double / int 이므로 더 큰 범위인 double 형으로 결과값 출력
		System.out.println("div3 = " + div3);
		
		double div4 = (double) 3 / 2; // double / int 이므로 큰 범위인 double 형으로 결과 출력
		System.out.println("div4 = " + div4);
		
		int a = 3;
		int b = 2;
		double result = (double) a / b;  //double(형변환) /  int 이므로 큰 범위인 double 값출력 
		System.out.println("result = " + result);
	}
}
