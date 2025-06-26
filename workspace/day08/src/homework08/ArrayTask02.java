package homework08;

public class ArrayTask02 {

	public static void main(String[] args) {
//		정수형 배열변수 배열 10칸짜리 선언
		int[] ar1 = new int[10];
		//값 대입 반복문
		for(int i = 0; i < ar1.length; i++) {
			ar1[i] = i + 1 ;
		}
		//정수형 변수 선언
		int total = 0;
		//출력 반복문
		for(int i = 0; i < ar1.length; i++) {
			 total += i + 1;
		}
		//출력 
		System.out.println(total);
	}
}


