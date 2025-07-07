package 김기수_05;
//(3) Student 클래스 정의
public class Student extends Person{//Person 클래스를 상속받는다.

//필드
//    int javaScore
//    int dbmsScore
//    int htmlScore
//    Major major
	int javaScore;
	int dbmsScore;
	int htmlScore;
	Major major;
	
//생성자
//이름, 전공, 세 과목 점수를 받아 초기화(부모생성자 사용)
	public Student(String name, int javaScore, int dbmsScore, int htmlScore, Major major) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major;
	}
	
//메소드
//getTotalScore() – 총점 반환
	int getTotalScore() {
		int total = javaScore + dbmsScore + htmlScore;
		System.out.println("총점: " + total);
		return total;
	}
	
//getAverageScore() – 정수 평균 반환
	int getAverageScore() {
		int avg = (javaScore + dbmsScore + htmlScore)/3;
		System.out.println("평균: " + avg);
		return avg;
	}
	
//getMajor() – 전공 반환
	void getMajor() {
		System.out.println(this.name + "님의 전공은 " + this.major + "입니다");
	}
	
	}
	
	

