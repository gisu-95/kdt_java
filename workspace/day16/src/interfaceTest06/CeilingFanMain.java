package interfaceTest06;

public class CeilingFanMain {
	public static void main(String[] args) {
		CeilingFanMain m = new CeilingFanMain();
		m.method(new CeilingFan());
		m.method(new TableFan());
		m.method(new TowerFan());
	}


	void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
}
