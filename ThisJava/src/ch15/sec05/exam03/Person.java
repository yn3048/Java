package ch15.sec05.exam03;

/*
 * 날짜 : 2024/01/20
 * 이름 : 이예나
 * 내용 : Comparable과 Comparator p.673
 */
public class Person implements Comparable<Person> {

	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}
