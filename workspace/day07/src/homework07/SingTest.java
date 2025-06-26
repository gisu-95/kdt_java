package homework07;

import java.util.Scanner;

public class SingTest {
	public static void main(String[] args) {
//		7. 코인 노래방 시스템을 구현하는 개발자입니다.
//		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
//
//		[요구사항]
//		사용자에게 곡 당 가격을 입력받는다.
//		반복문을 사용하여 사용자에게 금액을 계속 입력받는다.
//		단, 0을 입력하면 프로그램은 종료된다.
//		입력받은 금액으로 부를 수 있는 곡 수와 잔돈을 출력한다.
//		곡 수 : 금액 ÷ 곡당 가격
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
//		잔돈 : 금액 % 곡당 가격
//		음료(100원)를 마시고 싶다면, 음료 가격을 차감하고 노래를 줄이는 방식으로 대체 제안을 출력한다.
//		사용자에게 "음료를 구매하시겠습니까?" 라고 묻고
//		YES를 입력하면 대체 결과를 출력 NO를 입력하면 원래 계산된 노래 수를 유지한다
//		금액이 부족할 경우, 노래를 부를 수 없다는 안내 메시지를 출력한다.
//
//		입력은 정수로 받되, nextLine()을 사용하여 입력 오류를 방지한다.
//		대소문자 구분해서 YES/NO 처리한다.
//		Scanner는 한 번만 생성하고 마지막에 .close()로 닫을 것
		//입력 클래스,임포트
		Scanner sc = new Scanner(System.in);
		//정수형 상수 선언
		final int PRICE_DRINK = 100;
		// 정수형 변수 11개 선언
		int money = 0, price = 0, song = 0, change = 0,drinkMoney = 0 , drinkSong = 0, drinkChange = 0, bonus = 0, bonusSong = 0, drinkBonus = 0, drinkBonusSong;
		//입력 메시지 1
		System.out.print("곡 당 가격 입력 : ");
		// 입력 메소드 1
		price = sc.nextInt();
		// 입력 오류방지
		sc.nextLine();
		// while 반복문
		while (true) {
			//입력 메시지 2
		System.out.println("금액 입력 (0입력 시 종료): ");
		//입력 메소드 2
		money = sc.nextInt();
		// 입력 오류방지
		sc.nextLine();
		// if 조건문1, 출력메시지
		 if (money == 0) {
             System.out.println("종료");
             break;
         }
		 // if 조건문2, 출력메시지
         if (money < price) {
             System.out.println("금액이 부족합니다");
             continue;
         }
         //변수 계산
         song = money / price;
         bonus = song / 5;
         bonusSong = song + bonus;
         change = money % price;
         // 출력메시지
         System.out.printf("\n%d곡을 부를 수 있으며 잔돈은 %d원입니다", bonusSong, change);
         //추가로 필요한 변수 계산
		drinkMoney = money - 100 ;
		drinkSong = drinkMoney / price;
		drinkBonus = drinkSong / 5;
		drinkBonusSong = drinkSong + drinkBonus;
		drinkChange = drinkMoney % price;
		// if 조건문3, 출력메시지, 입력메시지3
		if (money >= PRICE_DRINK) {
			System.out.printf("\n음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d원입니다", drinkBonusSong, drinkChange);
			System.out.println("\n음료를 구매하시겠습니까? (YES/NO): ");
			//입력 메소드3
			String str1 = sc.next();
			//입력 오류 방지
			sc.nextLine();
			//if ~else if ~ else 조건문 ,출력 메시지
			if (str1.equals("YES")) {
				System.out.println("음료를 구매하셨습니다.");
				System.out.printf("\n%d곡을 부를 수 있으며 잔돈은 %d원입니다", drinkBonusSong, drinkChange);
			}else if(str1.equals("NO")) {
				System.out.println("음료를 구매하지 않았습니다.");
				}else {
					System.out.println("잘못된 입력입니다.");
				}
		}
		
	}
		// 스캐너 해제
		sc.close();
}
}