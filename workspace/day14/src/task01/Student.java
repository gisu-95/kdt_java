package task01;
//서브 클래스 : Student
//필드 : 학번, 전공
//생성자
//	기본생성자(이름없음, 0, 값 없음, 전공없음) 전달
//	매개변수가 4개 있는 생성자
//		student 생성자 호출 출력
//부모클래스의 introduce 메소드 오버라이딩
//	부모 메소드 호출
//	학번과 전공도 출력하는 메소드
public class Student extends Person{
	//필드
	String StudentId;
	String major;
	
	//생성자
	public Student() {
		this("이름없음", 0 , "값 없음", "전공없음");
	}
	
	public Student(String name, int age, String studentId, String major) {
		super(name, age);
		this.StudentId = studentId;
		this.major = major;
	}

	
	//오버라이딩
	@Override
	void introduce() {
		// TODO Auto-generated method stub
		super.introduce();
		System.out.println("학번 : " + this.StudentId + ", 전공 : " + this.major);
	}
	
	
	
	
	
}
