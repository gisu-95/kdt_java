package homework14;

import java.util.Arrays;
import java.util.Scanner;

public class homework06 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1~45 번호를 6개 입력하세요 : ");
		int[] pick = new int[6];
		for(int i=0;i<pick.length;i++) {
			pick[i] = sc.nextInt();
		}
		
		int[] ar = new int[6];
		for(int i=0;i<ar.length;i++) {
			int num=0;
			num = (int)(Math.random()*45)+1;
			ar[i] = num;
		}
//		int[] ar = {1, 1, 1, 1, 1, 1};
		System.out.println(Arrays.toString(ar));
		
		if(Arrays.equals(pick, ar)) {
			System.out.println("당첨");
		}else {
			System.out.println("아쉬운거지");
		}
	}
		
	}

