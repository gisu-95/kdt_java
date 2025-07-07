package homework15_김기수;

public class Employee extends Person{


//생성자
	public Employee(String name, int age, String year) {
		super(name, age, year);
	}
//work메소드
	public void work() {
		System.out.println("업무를 처리중입니다");
	}
//오버라이딩
	@Override
	void introduce() {
		System.out.println("저의 이름은 "+this.getName()+ "이고 회사원입니다");
	}
	
	
	
}
