package homework15_김기수;

public class Student extends Person{
//필드
	private boolean stu;
//생성자
	public Student(String name, int age, String year, boolean stu) {
		super(name, age, year);
		this.stu = stu;
	}
//study메소드
	public void study() {
		System.out.println(this.getName() + "이 공부합니다");
	}
//오버라이딩
	@Override
	void introduce() {
		System.out.println(this.getName() + "은 학생입니다");
	}
	
	

	
	
}
