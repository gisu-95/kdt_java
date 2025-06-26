package forTest;
//6번 : for문 연습
public class ForTask01 {

	public static void main(String[] args) {
		//for문만 사용
		//1. 100부터 1까지 출력(tab키로 띄어쓰기)
		for(int i = 100; i > 0; i--) {
			System.out.print(i + "\t");
		}
		//2. 구구단 3단만 출력
		System.out.println();
		for(int i = 1; i < 10; i++) {
			System.out.print("3x" + i + " = " + 3 * i + " ");	
		}
		//3. A ~ F 출력(초기식 char i = 'A')
		System.out.println();
		for(char i = 'A'; i <= 'F'; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		//4. A ~ F 출력(초기식 int i = 0)
		for(int i = 0; i < 6; i++) {
			System.out.print((char)(i + 65) + " ");
		}
		//5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
		// 홀수 => 소문자
		// 짝수 => 대문자
		System.out.println();
		for(int i = 0; i < 26; i++) {
			if(i % 2 == 0) {
				System.out.print((char)(i + 97));
			}else {
				System.out.print((char)(i + 65));
			}
		}
		System.out.println();
		for(int i = 0; i < 26; i++) {
			System.out.print((char)(i % 2 == 0? i + 97 : i + 65));
		}
		
		//첫번째 반복문
		//초기식 i 가 0, 조건식 0 < 26 true, 중괄호 영역 (char)(97) => a, 증감식 i++ => i = 0 + 1
		//현재 i의 값 1
		//	조건식 1 < 26 true, 중괄호영역 (char)(1 + 65) => (char)(66) => B, 증감식 i++ => i = 1 + 1
		//현재 i의 값 2
		//	조건식 2 < 26
		// ...
		//현재 i의 값 25
		//	조건식 25 < 26 true, 중괄호영역 (char)(25 % 2 == 0 false, 25 + 65) => (char)91, 증감식 i++ => 25+1
		//	
		
	}

}
