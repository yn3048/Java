package sub1;
/*
 * 날짜 : 2024/01/15
 * 이름 : 이예나
 * 내용 : Java Thread 실습하기
 * 
 */
class SubThread extends Thread {		//자식 Thread
	
	@Override
	public void run() {
		// 자식 스레드로 실행
		
		for(int i=1; i<=10 ; i++) {
			
			System.out.println(getName() + "스레드 실행...");
			
			try {
				sleep(1000);	//1초 동안 스레드 재우기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println(getName() + "스레드 종료...");
		
	}
	
}


public class ThreadTest {

	public static void main(String[] args) {
		
		// 스레드 생성
		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();
		
		// 스레드 이름 설정
		st1.setName("sub1");
		st2.setName("sub2");
		
		// 데몬 스레드 설정(메인스레드가 종료되면 같이 종료되는 스레드)
		st1.setDaemon(true);
		
		
		// 스레드 실행
		st1.start();
		st2.start();
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Main 스레드 실행...");
			
			try {
				Thread.sleep(1000);	//1초 동안 스레드 재우기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("프로그램 종료...");
		
	}
	
}











