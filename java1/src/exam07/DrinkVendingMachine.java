package exam07;

public class DrinkVendingMachine extends VendingMachine {
	DrinkVendingMachine() {
		System.out.println("음료수자판기");
		//벤딩머신에 기본생성자가 안보이게 있으니까 super 안 써도 됨
		//근데 기본생성자가 아니라 생성자에 파라미터가 있는 애만 있으면
		//기본생성자가 걍 안써지는 거 -> 그러니까 그때는 super 써줘야 함
		//super(); 써줘야해 그때는
	}

}
