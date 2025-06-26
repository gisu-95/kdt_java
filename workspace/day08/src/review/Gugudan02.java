package review;

public class Gugudan02 {

	public static void main(String[] args) {
//		2) 단별로 가로로 출력하기 Gugudan02
		//로직구성
				//for 문(int i = 1; i < 10; i++ ){
				//		for 문(int j = 2; j < 10; j++){
				//출력메시지
				//}
				// 한줄비움
				//}
		for(int i=2; i<10 ; i++) {
			System.out.print(i+"단\t\t");
		}
		System.out.println();
		for(int i = 1; i < 10; i++ ) {
		for(int j = 2; j < 10; j++) {
			System.out.printf("%d x %d = %2d\t",j,i,i*j);
		}
		System.out.print("\n");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
