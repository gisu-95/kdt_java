package homework08;

public class ArrayTask07 {

	public static void main(String[] args) {
		// aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력(char만 사용, 선언 없이)
		int ar[]= new int[26];
		
		
		for(int i = 0; i < ar.length; i++) {
			if(i % 2 == 0) {
				System.out.print((char)(ar[i] + 97));
			}else {
				System.out.print((char)(ar[i] + 65));
			}
		}
	
	}

}
