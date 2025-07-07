package homework15_김기수;

public class Main {
	public static void main(String[] args) {
		
		
		Person person = new Person("김기수", 31, "950724");
		System.out.println(person);
		person.introduce();
		
		
		Person person1 = new Student("김기수학생", 31, "950724",true);
		System.out.println(person1);
		person1.introduce();
		((Student)person1).study();
//		person1.study(student);
		
		
		Person person2 = new Teacher("김기수선생", 31, "950724");
		System.out.println(person2);
		person2.introduce();
		((Teacher)person2).teach();
		
		Person person3 = new Employee("김기수일꾼", 31, "950724");
		System.out.println(person3);
		person3.introduce();
		((Employee)person3).work();
		
		
		
		Student student = new Student("김기수학생", 31, "950724",true);
		Teacher teacher = new Teacher("김기수선생", 31, "950724");
		Employee employee = new Employee("김기수일꾼", 31, "950724");
		Main.trystudy(person1);
		Main.trystudy(person2);
		Main.trystudy(person3);
		Main.tryteach(person1);
		Main.tryteach(person2);
		Main.tryteach(person3);
		Main.trywork(person1);
		Main.trywork(person2);
		Main.trywork(person3);
		
			
	}

	static void trystudy(Person per) {
		if(per instanceof Student) {
			((Student)per).study();
		}else {
			System.out.println("공부안해!!");
		}
	}
	
	static void tryteach(Person per) {
		if (per instanceof Teacher) {
			((Teacher)per).teach();
		}else {
			System.out.println("안가르쳐!!");
		}
	}
	
	static void trywork(Person per) {
		if ( per instanceof Employee) {
			((Employee)per).work();
		}else {
			System.out.println("일 때려쳐!!");
		}
	}
	
	
}
