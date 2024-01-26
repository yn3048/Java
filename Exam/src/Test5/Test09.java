package Test5;


enum Gender { //열거 타입(범주형 타입) ex) 요일, 계절, 성별, 학점등급 etc)
	MALE, FEMALE //(Male:0, Female:1)
}

class Man {
	public void print() {
		System.out.println("남자 입니다.");
	}
}

class Women {
	public void print() {
		System.out.println("여자 입니다.");
	}
}



public class Test09 {

	public static void main(String[] args) {
		
		Object human1 = makeHuman(Gender.MALE);
		Object human2 = makeHuman(Gender.FEMALE);
		
		//instanceof는 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자
		//Object는 최상위 클래스이므로 instanceof Object는 항상 true
		if(human1 instanceof Man) {  //최상위 클래스 Object 에서 Man클래스를 찾아서
			Man man = (Man) human1;  //Man 클래스로 다운캐스팅
			man.print();
		}
		
		if(human2 instanceof Women woman)  {  //woman 으로 다운캐스팅
			woman.print();
			}
		}
	
	 public static Object makeHuman(Gender gender) { //Gender : 열거타입
		 if(gender == Gender.MALE) {
			 return new Man();
		 } else if (gender == Gender.FEMALE) {
			 return new Women();
		 }
		 return null;
	 }
}


















