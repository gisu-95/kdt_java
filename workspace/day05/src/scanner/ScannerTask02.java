package scanner;

import java.util.Scanner;

//10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTask02 {
	public static void main(String[] args) {
		
		//1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번, 출력은 1번만 사용해서 출력형태 만들기)
		//입력1 : 자바는
		//입력2 : 객체지향
		//입력3 : 언어입니다
		//출력
		//자바는
		//객체지향
		//언어입니다
		
		//1)입력클래스 선언
		Scanner sc = new Scanner(System.in);
		//2)입력클래스 import
		
		//3) 입력 메시지 출력, 문자열 변수선언, 입력메소드 사용
				System.out.print("입력1 : ");
				String java = sc.next();
				System.out.print("입력2 : ");
				String gak = sc.next();
				System.out.print("입력3 : ");
				String lang = sc.next();
		//3)문자열 변수선언, 입력메소드 사용
		//4)결과 출력
		System.out.println(java + "\n" + gak + "\n" + lang);
		
		//2. 이름과 나이, 취미를 순서대로 입력받기(입력메소드 이름과 취미 nextLine()사용, 나이는 next()사용)
		// 출력시 printf 사용, 형변환 반드시 적용해서 출력할 것
		//이름입력 : 홍길동
		//나이입력 : 20
		//취미입력 : 여행
		//[출력]
		//홍길동은 20살이고 취미는 여행입니다.
		//홍길동은 2026년에 21살입니다.

		//1) 입력클래스 선언
		Scanner sc1 = new Scanner(System.in);
		//2)입력클래스 import
		
		//3) 입력 메시지 출력, 문자열 변수선언, 입력메소드 사용
		sc.nextLine();//)버퍼 지우기
		System.out.print("이름입력 : ");
		String name = sc.nextLine();
		System.out.print("\n나이입력 : ");
		String age = sc.next();	
		//)버퍼 지우기
		sc.nextLine();
		System.out.print("\n취미입력 : ");
		String hobby = sc.nextLine();
		//4)문자열 형변환
		int age1 = Integer.parseInt(age);
		//5) 결과 출력
		System.out.printf("%s은 %d살이고 취미는 %s입니다.\n", name, age1, hobby);
		System.out.printf("2026년에 %d살입니다.", age1 + 1);
		sc.close();
	}

}
