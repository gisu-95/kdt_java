package homework08;

import java.util.Scanner;

public class ArrayTask08 {

	public static void main(String[] args) {
		// 5개 의 정수 입력받은뒤 그값을 배열에 담고 최대값과 최소값 출력
		// 입력클래스 , 임포트
		Scanner sc = new Scanner(System.in);
		//숫자 5개 정수형 변수 선언
		int num1, num2, num3, num4, num5 ;
		//입력 메시지
		System.out.println("정수 다섯개를 입력하세요");
		// 입력 메소드 5개
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();		
		// 배열 변수 선언
		int[] ar1 = {num1, num2, num3, num4, num5};
		// if  ese if esle조건문(최대값)
		if(ar1[0] > ar1[1]&&ar1[0] > ar1[2]&&ar1[0] > ar1[3]&&ar1[0] > ar1[4]) {
			System.out.println("최대값은 " + ar1[0] + "입니다");
			}else if(ar1[1] > ar1[0]&&ar1[1] > ar1[2]&&ar1[1] > ar1[3]&&ar1[1] > ar1[4]) {
				System.out.println("최대값은 " + ar1[1] + "입니다");
			}else if(ar1[2] > ar1[0]&&ar1[2] > ar1[1]&&ar1[2] > ar1[3]&&ar1[2] > ar1[4]) {
				System.out.println("최대값은 " + ar1[2] + "입니다");
			}else if(ar1[3] > ar1[0]&&ar1[3] > ar1[1]&&ar1[3] > ar1[2]&&ar1[3] > ar1[4]) {
				System.out.println("최대값은 " + ar1[3] + "입니다");
			}else {
				System.out.println("최대값은 " + ar1[4] + "입니다");
			}
		// if  ese if esle조건문(최소값)
		if(ar1[0] < ar1[1]&&ar1[0] < ar1[2]&&ar1[0] < ar1[3]&&ar1[0] < ar1[4]) {
			System.out.println("최소값은 " + ar1[0] + "입니다");
			}else if(ar1[1] < ar1[0]&&ar1[1] < ar1[2]&&ar1[1] < ar1[3]&&ar1[1] < ar1[4]) {
				System.out.println("최소값은 " + ar1[1] + "입니다");
			}else if(ar1[2] < ar1[0]&&ar1[2] < ar1[1]&&ar1[2] < ar1[3]&&ar1[2] < ar1[4]) {
				System.out.println("최소값은 " + ar1[2] + "입니다");
			}else if(ar1[3] < ar1[0]&&ar1[3] < ar1[1]&&ar1[3] < ar1[2]&&ar1[3] < ar1[4]) {
				System.out.println("최소값은 " + ar1[3] + "입니다");
			}else {
				System.out.println("최소값은 " + ar1[4] + "입니다");
			}
			sc.close();
		}
		
}


