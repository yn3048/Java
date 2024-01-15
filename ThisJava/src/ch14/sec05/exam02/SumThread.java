package ch14.sec05.exam02;
/*
 * 날짜 : 2024/01/15
 * p.605  다른 스레드의 종료를 기다림 join()
 * 
 */
public class SumThread extends Thread {

	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
	}
}
