package homework07;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
//		1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)
		//입력클래스 임포트
		Scanner sc = new Scanner(System.in);
		//정수형변수 선언
		int num1;
		//입력메시지
		System.out.println("정수를 입력하세요");
		//입력메소드
		num1 = sc.nextInt();
		//삼항 연산자 출력
		System.out.println(num1 % 2 == 0 ? "짝수입니다" : "홀수입니다");
		
//		2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		//정수형 변수 선언
		int num2;
		//입력메시지
		System.out.println("정수를 입력하세요");
		//입력메소드
		num2 = sc.nextInt();
		//조건문if ~ else if ~ else 출력
		if(num2 > 0) {
			System.out.println("양수");
		}else if(num2 < 0) {
			System.out.println("음수");
		}else {
			System.out.println(num2);
		}
//		3. 나이를 입력받아서 다음 기준으로 출력하기
//			0 ~ 12	: 어린이입니다
//			13 ~ 19	: 청소년입니다
//			20 이상 	: 성인입니다
//			나이입력	: 16
//			현재 나이는 16살이고 청소년입니다
		// 정수형 변수선언
		int age;
		// 입력메시지
		System.out.print("나이를 입력하세요 : ");
		// 입력메소드
		age = sc.nextInt();
		// if ~ else if ~ else 출력
		if(age < 13) {
			System.out.println("어린이입니다");
		}else if(age > 12 && age < 20) {
			System.out.println("청소년입니다");
		}else {
			System.out.println("성인입니다");
		}
		
//		4. 세 개의 정수를 입력받아 내림차순으로 정렬하여 출력하기
//			단, 세 개의 정수는 모두 다른 숫자 이어야 한다(중복값 x)
//			숫자 3개 입력 : 5 1 9
//			정렬된 숫자 : 9 5 1
		//정수형 변수 3개 선언
		int number1, number2, number3;
		//입력메시지 1
		System.out.println("숫자1 입력 : ");
		//입력메소드 1
		number1 = sc.nextInt();
		//입력메시지 2
		System.out.println("숫자2 입력 : ");
		//입력메소드 2
		number2 = sc.nextInt();
		//입력메시지 3
		System.out.println("숫자3 입력 : ");
		//입력메소드 3
		number3 = sc.nextInt();
		// if ~else if ~else 문 출력
		if (number1 > number2 && number2 > number3) {
			System.out.println(number1 + " "+ number2 + " " + number3);
		}else if(number1 > number3 && number3 > number2) {
			System.out.println(number1 + " " + number3 + " " + number2);
		}else if(number2 > number1 && number1 > number3) {
			System.out.println(number2 + " " + number1 + " " + number3);			
		}else if(number2 > number3 && number3 > number1) {
			System.out.println(number2 + " " + number3 + " " + number1);			
		}else if(number3 > number1 && number1 > number2) {
			System.out.println(number3 + " " + number1 + " " + number2);						
		}else {
			System.out.println(number3 + " " + number2 + " " + number1);									
		}
		sc.nextLine();
//		5. 사용자가 문자열을 입력받고 "x"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
		// 문자열 변수 선언
		String str1;
		//입력 메시지
		System.out.println("입력하세요 : ");
		// while 반복문
		while(true) {
			//입력 메소드
			str1 = sc.next();
			//if ~else 조건문 ,출력
			if(str1.equals("x")) {
				System.out.println("종료");
	            break;
	         }else{
	        	System.out.println(str1);
	        }
		}
		sc.close();

	}

}
