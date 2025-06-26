package homework08;

public class ArrayTask06 {

	public static void main(String[] args) {
		// A ~ F 까지중 C만 제외하고 배열에 담아 출력
		//배열변수 선언
		int ar[] = {65, 66, 67, 68, 69, 70};
		//for 조건문
		for(int i = 0; i < ar.length;i++) {
			//if 조건문 c에 해당하는 2가 아니면~
			if(i != 2) {
				// 출력
				System.out.print((char)(ar[i]) + " ");
			}
		
		}
	}

}
