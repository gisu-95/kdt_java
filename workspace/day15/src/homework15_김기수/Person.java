package homework15_김기수;

public class Person {
	//필드
	private String name;
	private int age;
	private String year;
	
	//생성자
	
	public Person(String name, int age, String year) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
	}

	//getter 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getYear() {
		return year;
	}
//introduce 메소드
	void introduce() {
		System.out.println(this.name + ", " + this.age + "살 입니다");
	}
	
	
}
