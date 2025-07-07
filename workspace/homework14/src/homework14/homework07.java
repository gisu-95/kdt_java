package homework14;

import java.util.Arrays;

public class homework07 {
	public static void main(String[] args) {
		int[] ar = new int[10];
		for(int i=0;i<ar.length;i++) {
			int num = 0;
			num = (int)(Math.random()*100) +1;
			ar[i]=num;
		}
		System.out.println(Arrays.toString(ar));
	}
}
