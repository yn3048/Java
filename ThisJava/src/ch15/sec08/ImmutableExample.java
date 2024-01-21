package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : LIFO 와 FIFO컬렉션
 * 수정할 수 없는 컬렉션 p.685
 */

public class ImmutableExample {

	public static void main(String[] args) {
		//List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
		//immutableList1.add("D");  (x)
		
		//Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
		//immutableSet1.remove("A");  (x)
		
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				1, "B",
				1, "C"
			);
		//immutableMap1.put(4, "D");   (x)
		
		//List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		//Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		//Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		//배열로부터 List 불변 컬렉션 생성
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr);
	}
}






