package homework07;

import java.util.Scanner;

public class Atmtest {
	public static void main(String[] args) {
		
//		6. ATM 메뉴에서 입금, 출금, 잔액조회 하기
//		[조건]
//		초기 잔액은 10000원으로 설정
//		메뉴 선택에 따라 작업 수행
//		종료시 프로그램 종료
//		숫자(번호)로 입력받기
//		String msg ="\\nATM 기기의 메뉴중 번호를 선택하세요 : "
//				+ "\\n1. 잔액조회"
//				+ "\\n2. 입금"
//				+ "\\n3. 출금"
//				+ "\\n4. 종료"
//				+ "선택 : ";
//				syso(msg);
//			그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//			번호 입력시 해당 메시지만 출력
		//입력 클래스 , 임포트
		Scanner sc = new Scanner(System.in);
		// 정수형 변수 선언
		int num;
		//while 반복문
		while(true) {
			// 입력 메시지
		System.out.println("\nATM 기기의 메뉴중 번호를 선택하세요 : "
				+ "\n1. 잔액조회"
				+ "\n2. 입금"
				+ "\n3. 출금"
				+ "\n4. 종료"
				+ "선택 : ");
		//입력 메소드
		num =sc.nextInt();
		//switch 조건문, 출력메시지
		switch(num) {
		case 1:
			System.out.println("잔액조회");
			break;
		case 2:
			System.out.println("입금");
			break;
		case 3:
			System.out.println("출금");
			break;
		case 4:
			System.out.println("종료");
			sc.close();
			break;
		default:
			System.out.println("다시 선택하세요");
		
			}
		}
		
		
	}
}
