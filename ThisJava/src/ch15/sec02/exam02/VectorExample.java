package ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

import ch15.sec02.exam01.Board;

/*
 * 날짜 : 2024/01/18
 * 이름 : 이예나
 * 내용 : Vector 컬렉션 자료구조 p.645
 * 	-Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 실행할 수 없다
 *  -그렇기 때문에 멀티 스레드 환경에서 안전하게 객체를 추가 또는 삭제할 수 있다.
 */
public class VectorExample {

	public static void main(String[] args) {
		//Vector 컬렉션 생성
		List<Board> list = new Vector<>();
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
			
		}
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: "+size);
		System.out.println();
	}
	
}












