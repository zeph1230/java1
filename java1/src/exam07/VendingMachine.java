package exam07;

public class VendingMachine implements Sale {

	private Drink d;
	@Override
	public void insertMoney(int money) {
		// TODO Auto-generated method stub
		System.out.println(money + "를 넣으셨네요");
	}

	@Override
	public void clickButton(Drink d) {
		// TODO Auto-generated method stub
		this.d = d;
		System.out.println(d.getName() + "을 선택");
	}

	@Override
	public Drink getDrink() {
		// TODO Auto-generated method stub
		return d;
	}

}
