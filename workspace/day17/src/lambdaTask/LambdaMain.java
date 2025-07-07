package lambdaTask;
//9번 : 람다 실습
public class LambdaMain {
	public static void main(String[] args) {
		
//		인터페이스명 : CombInter(함수형 인터페이스)
//		두 문자열을 입력받아 연결하는 추상메소드를 만든다(명령문은 1줄)
//		메인메소드에서 익명클래스로 객체화
//		메인메소드에서 람다식으로 객체화
	CombInter1 c = new CombInter1() {
		@Override
		public String yeongeul(String str1, String str2) {
			return str1+str2;
		
		}
	};
	
	CombInter1 cc = (str1, str2) -> str1+str2;
	System.out.println(cc.yeongeul("ㅇ", "ㅅㅇ"));
		
	}
	
	
}
