package ch14.sec07.exam01;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : 스레드 안전 종료 p.619
 * 
 */


public class PrintThread extends Thread {

	private boolean stop;
	
	public void setStop(boolean stop) {	//외붕에서 stop 필드값을 변경할 수 있도록 Setter 선언
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중"); //stop 필드값에 따라 반복 여부 결정
		}
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}
}
