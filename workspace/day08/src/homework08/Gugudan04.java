package homework08;

public class Gugudan04 {

	public static void main(String[] args) {
		//while문만 이용 구구단 출력(단별로 가로로 출력하기)
		int num1 = 1;

	        int dan1 = 2;
	        while (dan1 <= 9) {
	            System.out.print(dan1 + "단\t\t");
	            dan1++;
	        }
	        System.out.println();

	        while (num1 <= 9) {
	            int dan2 = 2;
	            while (dan2 <= 9) {
	                System.out.print(dan2 + " x " + num1 + " = " + (dan2 * num1) + "\t");
	                dan2++;
	            }
	            System.out.println();
	            num1++;
	        }

	}

}
