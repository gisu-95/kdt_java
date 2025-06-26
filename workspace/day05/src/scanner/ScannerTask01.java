package scanner;

import java.util.Scanner;

//9번 : 입력 메소드 실습1
public class ScannerTask01 {
	public static void main(String[] args) {
		//1. 본인의 이름과 성별을 입력받고 출력하기
		//입력 예> 이름 입력 : 
		//입력 예> 성별 입력 :
		//출력 예> 이름은 000이고 00입니다.
		
		//로직구성
		//1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		//2) 입력 클래스 import
		
		//3) 입력 메시지 출력
		System.out.println("이름 입력 : ");
		//4) 문자열 변수 선언, 입력메소드 사용
		String name = sc.next();
		System.out.println("성별 입력 : ");
		String gender = sc.next();
		//5) 결과 출력
		System.out.println("이름은 " + name + "이고 " + gender + "입니다.");

	}

}
