package ch14.sec05.exam03;

/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 다른 스레드에게 실행 양보 p.584
* 
*/
public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try { Thread.sleep(5000);} catch (InterruptedException e) {}
		workThreadA.work = false;
	
		try {Thread.sleep(10000);} catch (InterruptedException e) {}
				workThreadA.work = true;
		
	}
	
}