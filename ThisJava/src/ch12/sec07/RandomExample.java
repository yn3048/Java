package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

/*
 * 날짜 : 2024/01/19
 * 이름 : 이예나
 * 내용 : 랜덤 클래스 p.531
 */


public class RandomExample {

	public static void main(String[] args) {
		//Random() 디폴트 값은 현재 시간을 기준으로 함
		//Random(3) 이런 식으로 숫자를 넣을 경우 시작 기준을 설정 하는 것이다
		//Random(3)과 Random(3)은 동일한 난수를 발생시킨다
		//매번 실행할 때마다 다른 난수를 얻을 수 있는 가장 좋은 방법은 seed값으로
		//현재 시간을 활용하는 것이다. 시간은 계속 변하기 때문에 같은 난수 발생X
		Random ran1 = new Random();
		Random ran2 = new Random();
		
		int r1 = ran1.nextInt(10);
		int r2 = ran2.nextInt(10);
		
		System.out.println(r1);
		System.out.println(r2);
		
		
		
		
		//선택번호
		int[] selectNumber = new int[6];	//선택번호 6개가 저장될 배열 생성
		Random random = new Random();		//선택번호를 얻기 위한 Random 객체 생성
		System.out.print("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;	//1~45까지 숫자
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		
		//당첨번호
		int[] winningNumber = new int[6];	//당첨번호 6개가 저장될 배열 생성
		random = new Random();	//당첨번호를 얻기 위한 Random 객체 생성
		System.out.println("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");	// 당첨번호 6개를 얻어 배열에 저장
		}
		
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);	//비교하기 전에 배열 항목을 정렬시킴
		boolean result = Arrays.equals(selectNumber, winningNumber); //배열 항목 비교하기
		System.out.println("당첨여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	
	}

}
















