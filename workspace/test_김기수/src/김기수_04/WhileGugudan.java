package 김기수_04;

public class WhileGugudan {

	public static void main(String[] args) {
		int num=1;
		while(num<10) {
			int dan=2;
			while(dan<10) {
				System.out.printf("%d x %d = %d\t",dan,num,dan*num);
				dan++;
			}
			System.out.println();
			num++;
		}
		
	}
}
