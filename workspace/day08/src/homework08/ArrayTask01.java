package homework08;

public class ArrayTask01 {

	public static void main(String[] args) {
//		1. 100~1까지의 값을 배열에 넣고 출력
//		정수형 배열변수 배열 100칸짜리 선언
		int[] ar1 = new int[100];
		//값 대입 반복문
		for(int i = 0; i < ar1.length; i++) {
			ar1[i] = 100 - i ;
		}
		//출력 반복문
		for(int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
	}

	
}

