package ch12.sec04;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 프로세스 종료 p516
 */
public class ExitExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// i값 출력
			System.out.println(i);
			if (i == 5) {
				// JVM 프로세스 종료
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
	}

}