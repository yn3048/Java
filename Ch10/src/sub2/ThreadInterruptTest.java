package sub2;
/*
 * 날짜 : 2024/01/15
 * 이름 : 이예나
 * 내용 : Java Thread 상태 실습하기
 * 
 */

class SubThread extends Thread {
	
	@Override
	public void run() {
		
		int i = 1;
		
		try {
			
			while(true) {
				
				System.out.println("i : " + i);
				i++;
				
				sleep(1000);
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}


public class ThreadInterruptTest {

	public static void main(String[] args) {
		
		
		SubThread sub = new SubThread();
		sub.setName("sub");
		
		// 자식 스레드 실행
		sub.start();
		
		try {
			// 메인 스레드 10초 후 일시 정지 => 1초에 한번씩  SubThread가 실행되므로
										// 10번 실행 후에 종료됨
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 자식 스레드 종료 (InterruptedException 발생)
		sub.interrupt();
		
		System.out.println("Main Thread 종료...");
		
		
	}
	
}













