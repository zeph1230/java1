package exam07;

public class VendingMachine implements Sale {

	private Drink d;
	@Override
	public void insertMoney(int money) {
		// TODO Auto-generated method stub
		System.out.println(money + "�� �����̳׿�");
	}

	@Override
	public void clickButton(Drink d) {
		// TODO Auto-generated method stub
		this.d = d;
		System.out.println(d.getName() + "�� ����");
	}

	@Override
	public Drink getDrink() {
		// TODO Auto-generated method stub
		return d;
	}

}
