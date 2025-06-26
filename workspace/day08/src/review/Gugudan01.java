package review;

public class Gugudan01 {

	public static void main(String[] args) {
		//1) 단별로 세로로 출력하기
		//로직구성
		//for 문(int i = 2; i < 10; i++ ){
		//			출력메시지 "단"
		//		for 문(int j = 1; j < 10; j++){
		//출력메시지
		//}
		// 한줄비움
		//}
		for(int i = 2; i < 10; i++ ) {
			System.out.print(i + "단");
		for(int j = 1; j < 10; j++) {
			System.out.printf("\n%d x %d = " + i*j,i,j);
		}
		System.out.println("\n");
	}
		
		
		
	}
}
