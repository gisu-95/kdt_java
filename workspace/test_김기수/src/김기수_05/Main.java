package 김기수_05;

import java.util.Scanner;

//(4) Main 클래스 작성
//사용자로부터 학생 수를 입력받는다.
//각 학생에 대해 다음 정보를 입력받는다.
//    이름, 전공 (COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE), Java, DBMS, HTML 점수
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 클래스 임포트
		System.out.print("몇 명의 학생을 입력하시겠습니까? "); // 입력메시지 출력
		int student = sc.nextInt(); // 몇명의 학생 입력할지 입력받기
		Person p = new Person("짱구");//호출받기위한거
		Student st = new Student("짱구",90,0,100, null);
		sc.nextLine();
		for(int i=1;i<=student;i++) { // 학생수만큼 입력받고싶어서  for문 활용
			System.out.println("["+ i + "번째 학생 정보 입력]"); // 몇번째 학생 정보입력
			p.getName();//이름정보 불러오기
//			st.major; // 이건못해서 주석처리했습니다
			System.out.println("JAVA 점수 : " + st.javaScore);//자바점수 출력메시지
			System.out.println("DBMS 점수 : " + st.dbmsScore);//DBMS점수 출력메시지
			System.out.println("HTML 점수 : " + st.htmlScore);//HTML점수 출력메시지
			System.out.println(); // 한줄 비우셨네요
			System.out.println("=====성적 출력====="); // 생긴모습 그대로 
			System.out.println(p.name + "님의 전공은" + st.major + "입니다."); // ㅇㅇ님의 전공은 ㅇㅇㅇ입니다 출력
			st.getTotalScore(); // 총점 : 
			st.getAverageScore(); // 평균 : 
		}
		
	}
	
	
	
}
