package gameTask;
//2) Warrior 클래스
//Character 클래스 상속
//기본 생성자를 통해 전사, 30, 10, 5, 15, 100 전달
//skillAttack() 오버라이딩 : mp가 3보다 부족하면 실패, 아니면 mp 3소모
//specialAttack() 오버라이딩 : 피해 출력 + 체력 10 감소 + 부활 검사
//onlyWarrior() 메소드 : 전사만 사용할 수 있는 고유 행동입니다 출력
public class Warrior extends Character {

	public Warrior(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
		super("전사", 30, 10, 5, 15, 100);
	}

	@Override
	public void skillAttack() {
		super.skillAttack();
		if(this.mp < 3) {
			System.out.println("mp가 부족합니다");
		}else {
			mp-=3;
		}
	}
	
	
	

}
