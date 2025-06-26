package ifTest;

import java.util.Scanner;

//11번 : if~else 실습 1
public class IfTask01 {

	public static void main(String[] args) {
		
		//사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		//로직구성
		//1)입력 클래스, import
		Scanner sc = new Scanner(System.in);
		//2)정수형 변수 선언
		int choice = 0;
			//자료형들의 기본값
			//정수 0, 실수 0.0, 문자형 ' ', 문자열 ""or null, 논리형 false 
		//3)입력 메시지 출력
		System.out.println("숫자 1개 입력 : ");
		//4)변수 입력 메소드 사용
		choice = sc.nextInt();
		//5) 조건문(if ~else)문
			//if 조건식 산술연산자(%), 관계연산자(!=)
			// 출력메소드
			//else 
			// 출력메소드
		if(choice % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		//6) 스캐너 닫기
		sc.close();
		
		//삼항연산자
		System.out.println((choice % 2 != 1) ? "짝수입니다" : "홀수입니다");
	}

}
