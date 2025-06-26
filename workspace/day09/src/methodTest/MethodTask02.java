package methodTest;

public class MethodTask02 {
   public static void main(String[] args) {
	   MethodTask02 mt =  new MethodTask02();
	 //1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
	   //메소드명 : checkNum
	   System.out.println("===========1번===========");
	   System.out.println(mt.checkNum(4));
	   System.out.println("===========2번===========");
	   System.out.println(mt.getSum(null));
	   System.out.println("===========3번===========");
//	   System.out.println(mt.reverseStr("hello"));
	   System.out.println("===========4번===========");
	   System.out.println("===========5번===========");
	   mt.printGugudan(2);
	   System.out.println("===========6번===========");
	   System.out.println(mt.compareLength("hello", "hi"));
	   System.out.println("===========7번===========");
	   mt.loginTry("hell", "1234");
   }
   
   //1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
   //메소드명 : checkNum
   String checkNum(int num) {
	   //1) 정수현 변수 num을 2로나눈 나머지가 0이면 짝수입니다, 아니면 홀수입니다 삼항연산자
	   return (num%2==0)? "짝수입니다" : "홀수입니다";
   }
   //2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
   // 메소드명 : getSum
   int getSum(int[]ar) {
	   //1) 총합 구할 변수
	   int total = 0;
	   //2) 10칸짜리 정수배열
	   ar = new int[10];
	   //3) 배열의 합을 구하기위한 for문
	   for(int i = 1; i <=ar.length; i++) {
		   total += i;
	   }
	   //반환값
	   return total;
   }
   //3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
   //메소드명 : reverseStr
   // hello => olleh
   void reverseStr(String str) {
	   int[] ar = null;
	   for(int i = 0; i < ar.length; i ++) {

		   ar[i] = ar[ar.length - i];
		   
	   }
	  
   }
   
   //4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
   //메소드명 : contains
   //배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
   //   syso(메소드명(배열명, 10)) => true
   boolean contains(int ar[], int num) {
	   
	   for(int i=0;i<ar.length;i++	) {
		   if (ar[i] == num) {
			   return true;
		   }
		   
	   }
	   return false;
   }
   
   
   //5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
   //메소드명 : printGugudan
   //   3 x 1 = 3
   //   ...
   //   3 x 19 = _
   
   void printGugudan(int dan) {
	   for(int i = 1; i < 20; i++ ) {
		System.out.println(dan + " x " + i + " = " +dan * i);
   }
   }
   //6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
   //메소드명 : compareLength
	   String compareLength(String str1, String str2) {
		   //str1의 길이와 str2의 길이가 같을경우 다를경우 삼항연산자
		   return (str1.length()==str2.length()?"같음":"다름");
		}
	   
		   
	   
   
   //7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
   //loginTry
   void loginTry(String id, String pwd) {
	   String strId =  "hello";
	   String strPwd = "1234";
	   for(int i = 0; i < 3; i++) {
		   if(strId==id && strPwd==pwd) {
			  System.out.println("로그인 성공");
			  break;
		   }else {
			   System.out.println("계정 잠김");
		   }
	   }
	   
	   
   }

}
