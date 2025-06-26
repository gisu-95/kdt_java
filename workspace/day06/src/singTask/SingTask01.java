package singTask;

import java.util.Scanner;

public class SingTask01 {

	public static void main(String[] args) {
//		1) 한 곡당 금액도 입력받기
//	금액입력 : 1000
//	곡 당 가격 입력 : 300
//	[출력]
//	3곡을 부를 수 있으며 잔돈은 100원입니다
//
//	2) 잔돈이 부족할 경우 안내하기
//	금액입력 : 100
//	곡 당 가격 입력 : 
//	[출력]
//	입력한 금액은 100원입니다. 곡 당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다 출력
		
		//1) 입력클래스, import
		Scanner sc = new Scanner(System.in);
		//2) 입력메시지 출력1
		System.out.println("금액입력 :");
		//3) 정수형 변수1 = 입력메소드(nextInt())
		int paid = sc.nextInt();
		//4) 입력메시지 출력2
		System.out.println("곡 당 가격 입력 :");
		//5) 정수형 변수2 = 입력메소드(nextInt())
		int price = sc.nextInt();
		//6) 정수형 변수3 = 변수1 / 변수2
		int song = paid / price;
		//7) 정수형 변수4 = 변수1 % 변수2
		int change = paid % price;
		//8) 정수형 변수5 = 변수2 - 변수1
		int bujok = price - paid;
		//8) if else문 , 출력메시지
		if (paid > price) {
			System.out.println(song + "곡을 부를 수 있으며 잔돈은" + change + "원 입니다");
		}else {
			System.out.println("입력한 금액은 " + paid + "원입니다. 곡 당 가격은 " + price + "원으로 " + bujok + "원이 부족하여 노래를 부를 수 없습니다");
		}
		//9) Scanner 해제
		sc.close();
		
		
	}

}
