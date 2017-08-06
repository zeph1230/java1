package exam09;

public class CartGame extends Thread{
	
	public Cart c;
	public CartGame(Cart c) {
		this.c = c;
	}
	public void run() {
		c.startCart();
		try {
			Thread.sleep(c.speed);
			c.runningCart();
		}catch(Exception e) {
			e.printStackTrace();
		}
		c.endCart();
	}
	
	public static void main(String[] args) {
		String[] cartNames = {"aa", "bb", "cc", "dd"};
		for(int i=0;i<cartNames.length;i++) {
			int speed = (int)(Math.random()*3000) + 1000;
			Cart c = new Cart(speed, cartNames[i]);
			CartGame cg = new CartGame(c);
			cg.start();
		}
	}
}
