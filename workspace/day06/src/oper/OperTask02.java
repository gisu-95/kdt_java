package oper;

import java.util.Scanner;

//6번 : 삼항연산자 실습1
public class OperTask02 {

	public static void main(String[] args) {
		
		//두 수를 입력받아 비교
		//크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직구성
		
		//1)입력클래스 import
		Scanner sc = new Scanner(System.in);
		//2)입력메시지 출력
		System.out.println("숫자 1 입력 : ");
		//3)변수선언, 입력메소드 사용
		int num1 = sc.nextInt();
		//4)입력메시지 출력
		System.out.println("숫자 2 입력 : ");
		//5)변수 선언, 입력메소드 사용
		int num2 = sc.nextInt();
		//6) 삼향연산자 사용하여 출력 => 크다/작다/같다가 출력되어야함
		//조건식 ? 참일때의 값 : 거짓일때의 값
		//조건식1 ? 참일때의 값 : 조건식2 ? 참일때의 값 : 거짓일 때의 값
		System.out.println(num1 > num2 ? + num1 + "이(가) 크다" : num1 == num2 ? + num1 + "와(과)"+ num2 + "는 같다" : + num1 + "이(가) 작다");
		//7) 스캐너 해제
//		sc.close();
		
		//2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기
		// 짝수입니다 or 짝수가 아닙니다로 출력할 것
		
		// 1) 입력클래스 import
		//2) 입력메시지
		System.out.println("정수를 입력하세요");
		//3)변수 선언 입력메소드 사용
		int num3 = sc.nextInt();
		//4) 출력
		System.out.println(((num3 % 2) == 0) ? "짝수입니다" : "홀수입니다");
		//5) 스캐너해제
		sc.close();
		
//		---------------------------------------------------------
//		2번 실습 선생님 답안
		
		//1)입력클래스 import
		//2) 정수형 변수 1개 (입력메소드), 문자열변수 1개(삼항연산자, 산술연산자, 관계연산자)
		//3)출력
//		
		
	}

}
