package homework14;

public class Homework02 {
	public static void main(String[] args) {
		
		int[] ar = new int[100];
		
		int total = 0;
		for(int i=0;i<ar.length;i++) {
			ar[i] = i+1;
			if (ar[i]%2==0) {
				total += ar[i];
			}
		}System.out.println(total);
		
	}
}
