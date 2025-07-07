package interfaceTest04;
//16번 : 다중상속(모호성 해결방법 예제)
public class ClassB extends ClassA implements Inter1{
	//ClassA와 inter1 양쪽에 printText() 메소드가 존재하지만 오류가 발생하지않는다
	//구현하는 인터페이스보다 사속받는 부모클래스와 우선순위가 높기 때문이다
	

}
