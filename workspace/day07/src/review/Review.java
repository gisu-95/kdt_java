package review;

import java.util.Scanner;

//3번 복습문제
public class Review {

	public static void main(String[] args) {
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		//그 외 숫자를 입력시에는 잘못입력했습니다 출력하기
		
		//로직구성
		//입력 클래스 선언, import
		//정수형 변수 선언
		//입력 메시지 출력
		//입력 메소드
		//if else조건문
		// if(변수 >= 1 && 변수 <= 10){
		//	출력 변수 제곱
		//}else {
		// 잘못입력했습니다 출력
		//}
		// 스캐너 해제
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("1부터 10사이의 숫자만 입력하세요");
//		num = sc.nextInt();
//		if ( num >= 1 && num <= 10) {
//			System.out.println(num * num);
//		} else {
//			System.out.println("잘못입력했습니다");
//		}
		
		//문자열끼리의 비교는 관계연산자(==)을 사용하지않고
		//.equals() 메소드를 사용해서 비교한다!!!
		System.out.println("문자열1 입력 :");
		String data1 = sc.nextLine();
		System.out.println("문자열2 입력 :");
		String data2 = sc.nextLine();
		System.out.println(data1 == data2); //false
		System.out.println(data1.equals(data2)); //true
		if(data1.equals(data2)) {
			System.out.println("두 문자열 같습니다");
		}else {
			System.out.println("두 문자열은 같지 않습니다");
		}
		
		sc.close();
	}

}
