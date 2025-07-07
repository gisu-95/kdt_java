package homework15_김기수;

public class Teacher extends Person{


//생성자
	public Teacher(String name, int age, String year) {
		super(name, age, year);
	}
//teach메소드
	public void teach() {
		System.out.println(this.getName() + "이 가르칩니다");
	}
//오버라이딩
	@Override
	void introduce() {
		System.out.println("저는 선생님입니다");
	}
	
	
	
	
}
