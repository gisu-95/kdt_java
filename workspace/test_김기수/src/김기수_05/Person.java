package 김기수_05;
//(2) Person 클래스 정의
public class Person {
//필드
//    String name
	String name;

//생성자
//    이름을 매개변수로 받아 초기화
	public Person(String name) {
		this.name = name;
	}
	
//메소드
//    getName() — 이름 반환
	String getName() {
		System.out.println("이름 : " + name);
		return name;
		
	}

}
