package ch02.sec11;


/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : 변수 사용 범위 p.67
 */

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
	//	int v3 = v1 + v2 + 5;	//v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}
}
