package classBasic2;
//12번 : Rectangle 클래스 main
public class RectangleMain {

	public static void main(String[] args) {
		
		//객체화
		//클래스 자료형 객체명 = new 생성자();
		Rectangle r1 = new Rectangle();
		System.out.println(r1); //classBasic2.Rectangle@279f2327
		
		//객체명.필드명 = 값;
		r1.height = 20;
		r1.width = 10;
		
		//넓이를 구하는 메소드 호출(매개변수 x, 리턴값 o => syso(객체명.메소드명());
		System.out.println(r1.getArea());
		//둘레를 구하는 메소드 호출
		r1.getPerimeter();
	}

}
