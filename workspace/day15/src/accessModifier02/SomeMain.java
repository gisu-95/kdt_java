package accessModifier02;

import accessModifier01.AccessTarget;

public class SomeMain {
	public static void main(String[] args) {
		System.err.println("======= 다른 패키지 내 접근 =======");
		
		AccessTarget a1 = new AccessTarget(); // public 생성자
//		AccessTarget a2 = new AccessTarget("hello"); // protected 생성자 - 직접 접근 불가
//		AccessTarget a3 = new AccessTarget(1234); // default 생성자
//		AccessTarget a4 = new AccessTarget();// private 생성자
		
		a1.publicMethod();
//		a1.defaultMethod();	//다른 패키지 + 직접 접근 불가
		
		AccessTest test = new AccessTest(); //자식클래스
		test.testAccess();
	}
}
