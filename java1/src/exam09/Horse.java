package exam09;

public class Horse {
	
	public int speed = 0;
	public String name;
	
	public Horse(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	public void startHorse() {
	System.out.println(this.name + "�� �ٱ� ����");
	}
	
	public void runningHorse() {
		System.out.println(this.name + "�� �ٴ� ��");
	}
	
	public void endHorse(int idx) {
		System.out.println(this.name + "�� " + idx + "��°�� ����� ����");
	}

}
