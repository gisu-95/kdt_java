package task01;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.introduce();
		s1.sleep(23);
		
		Student s2 = new Student("김기수", 31, "1411487", "경제학과");
		s2.introduce();
		s2.sleep(2);
		
	}
}
