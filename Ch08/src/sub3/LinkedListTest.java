package sub3;
/**
 * 날짜 : 2024/01/10
 * 이름 : 이예나
 * 내용 : Java LinkedList 실습 
 * 
 */


import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("서울");
		list.add("대전");
		list.add("대구");
		list.add("부산");
		list.add("광주");
		
		System.out.println(list);
		
		// 링크(데이터)추가
		list.add(1, "수원"); //인덱스 1번에 추가
		list.addFirst("인천"); // 인덱스 첫번째에 추가
		list.addLast("울산");  //인덱스 마지막에 데이터 추가
		System.out.println(list);
	}
	
}
