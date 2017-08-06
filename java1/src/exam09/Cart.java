package exam09;

public class Cart {

	public int speed = 0;
	public String name;
	
	public Cart(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	public void startCart() {
		System.out.println(this.name + "이 출발");
	}
	
	public void runningCart() {
		System.out.println(this.name + "이 운전 중");
	}
	
	public void endCart() {
		System.out.println(this.name + "이 도착");
	}
	
	
	
}
