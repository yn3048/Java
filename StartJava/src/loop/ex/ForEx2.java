package loop.ex;

public class ForEx2 {

	//for문 사용해서 짝수 10번 출력
	public static void main(String[] args) {
		int num = 2;
		for(int count = 1; count <= 10; count++) {
			System.out.println(num);
			num +=2;
		}
	}
}
