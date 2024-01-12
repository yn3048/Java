package Test4;
/*
 * 
 * 날짜 : 2024/01/12
 * 이름 : 이예나
 * 내용 : 로또번호 연습문제
*/
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {

	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
		
	}
	
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int)Math.ceil(Math.random() *45);
					
			lottoSet.add(num);
					
			if(lottoSet.size() == 6) {	//로또 주머니에 6개가 들어가면 break;
				break;
			}	
		}
		
		// 정렬을 위해 TreeSet 사용
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
	
	
}









