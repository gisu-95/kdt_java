package homework08;

public class Gugudan03 {

	public static void main(String[] args) {
		//for 조건문 1단~3단 출력
		for(int i=1; i<4 ; i++) {
			System.out.print(i+"단\t\t");
		}
		//한줄 여백
		System.out.println();
		//for문 for문 i=곱해지는 수 j=단 으로 두고 구간 잘 나누기
		for(int i = 1; i < 10; i++ ) {
		for(int j = 1; j < 4; j++) {
			System.out.printf("%d x %d = %2d\t",j,i,i*j);
		}
		System.out.print("\n");
	}
		//한줄 여백
		System.out.println();
		//for 조건문 4단~6단 출력
		for(int i=4; i<7 ; i++) {
			System.out.print(i+"단\t\t");

		}
		//for문 for문 i=곱해지는 수 j=단 으로 두고 구간 잘 나누기
		System.out.println();
		for(int i = 1; i < 10; i++ ) {
		for(int j = 4; j < 7; j++) {
			System.out.printf("%d x %d = %2d\t",j,i,i*j);
		}
		System.out.print("\n");
	}
		//한줄 여백
		System.out.println();
		//for 조건문 7단~9단 출력
		for(int i=7; i<10 ; i++) {
			System.out.print(i+"단\t\t");

		}
		//한줄 여백
		System.out.println();
		//for문 for문 i=곱해지는 수 j=단 으로 두고 구간 잘 나누기
		for(int i = 1; i < 10; i++ ) {
		for(int j = 7; j < 10; j++) {
			System.out.printf("%d x %d = %2d\t",j,i,i*j);
		}
		System.out.print("\n");
	}
	}

}
