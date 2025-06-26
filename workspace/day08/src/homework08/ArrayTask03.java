package homework08;

import java.util.Scanner;

public class ArrayTask03 {

	public static void main(String[] args) {
		// 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
		//입력 클래스, 임포트
		Scanner sc = new Scanner(System.in);
		//수학점수 3개 정수형 변수 선언
		int score1, score2, score3 ;
		//입력 메시지
		System.out.println("3명의 수학점수를 입력하세요");
		// 입력 메소드 3개
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();
		
		// 배열 변수 선언
		int[] ar1 = {score1, score2, score3};
		// 출력 메시지
		System.out.println("평균점수는 " + (ar1[0] + ar1[1] + ar1[2])/3 + "점 입니다.");
		
		sc.close();
	}

}
