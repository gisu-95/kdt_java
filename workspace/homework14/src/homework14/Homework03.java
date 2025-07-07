package homework14;

public class Homework03 {
	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		int count = 0;
		do {
			count++;
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num1 + ", " + num2);
		}while(num1 != num2);
		
		System.out.println(count);

	}
}
