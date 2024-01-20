package ch13.sec05;


/*
* 날짜 : 2024/01/20
* 이름 : 이예나
* 내용 : 와일드카드 타입 파라미터 p.584
*/

public class Applicant<T> {

	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind;
	}
}
