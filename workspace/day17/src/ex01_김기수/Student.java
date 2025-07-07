package ex01_김기수;

public class Student extends Person{

	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	@Override
	void score() {
		
		System.out.println(this.getName() + "의 점수는" + this.score + "점 입니다");
		
	}
	
	
	
}
