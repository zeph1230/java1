package exam06;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public void printOption(Car c, String carName) {
		c.choiceCar(carName);
		if(!c.checkCarName()) {
			System.out.println("선택하신 자동차가 없습니다.");
		}else {
			c.printName();
			System.out.println("시동을 켭니다.");
			c.move();
			c.stop();
			System.out.println("시동을 끕니다.");
		}
	}
	
	public static void main(String[] args) {
		Execute e = new Execute();
		List<String> kiaCarList = new ArrayList<String>();
		kiaCarList.add("K7");
		kiaCarList.add("K5");
		kiaCarList.add("K3");
		Kia k = new Kia(kiaCarList);
		e.printOption(k,"K7");
		
		List<String> hCarList = new ArrayList<String>();
		hCarList.add("Avante");
		hCarList.add("Sonata");
		hCarList.add("Accent");
		
		Hyundai h = new Hyundai(hCarList);
		e.printOption(h,"Avante");
		
		List<String> bCarList = new ArrayList<String>();
		bCarList.add("CLS");
		bCarList.add("SLK");
		Benz b = new Benz(bCarList);
		e.printOption(b, "CLS");
	}
}
