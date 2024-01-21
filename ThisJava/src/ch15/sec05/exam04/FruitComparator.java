package ch15.sec05.exam04;

import java.util.Comparator;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : Comparable과 Comparator p.673
 */
public class FruitComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return -1;
		else if(o1.price == o2.price) return 0;
		else return 1;
	}
}
