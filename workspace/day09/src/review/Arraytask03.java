package review;

import java.util.Scanner;

public class Arraytask03 {

	public static void main(String[] args) {
//      3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
	      
      //1) 입력클래스 import
      //2) 3칸짜리 배열 선언
      //3) 총합 저장할 변수, 평균 저장할 변수 double avg
      //4) for문 (1부터 3까지 반복)
      //      몇번째 학생의 점수인지 출력
      //      배열명[i] = nextInt()
      //      총합저장할 변수 += 배열명[i] 
      //5) avg = 총합 / 3.0
      
//      int avg1 = 10 / 3;
//      double avg2 = 10 / 3;
//      double avg3 = 10 / 3.0;
//      System.out.println(avg1); //3
//      System.out.println(avg2); // 3.0
//      System.out.println(avg3); // 3.3333333333333335
		
		 Scanner sc = new Scanner(System.in);
	      int[] scores = new int[3];
	      int sum = 0;
	      double avg = 0.0;

	      for (int i = 0; i < scores.length; i++) {
	         System.out.println((i + 1) + "번째 학생의 수학점수 입력 : ");
	         scores[i] = sc.nextInt();
	         sum += scores[i];
//	         System.out.println(sum);
	      }
	      avg = sum / 3.0;
	      System.out.println("평균점수 : " + avg);
	      avg = sum / 3;
	      System.out.println("정수형으로 나눴을 경우 평균점수 : " + avg);

	      avg = (double) sum / 3;
	      System.out.println("강제형변환으로 나눴을 경우 평균점수 : " + avg);
	      sc.close();

	}

}
