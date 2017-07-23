package exam03;

public class Son extends Father{
	
	public Son() {
		//걍 함수랑 다르고 리턴타입 없고, 이거 안 만들어도 자바가 만들어준다
		//이게 선행되고 Son s = new Son();가 되는 거... 생성자.......
	}
	public void printHouse() {
		System.out.println(house);
	}
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.house);
		System.out.println(s.who);
		
		s.printHouse();
		s.doJob();
		s.who = "나";
		s.doSleep();
		
		// overriding. 상속받았을 때만 가능. 같은 함수명 덮어쓰기 = 함수의 재정의
		//Ctrl + Space 어느 정도 함수 치고 자동 완성
		//1 -> 2 -> 3으로 상속하면 3에서 1, 2에 동시에 있는 함수를 쓰면 누가 먼저? 2가 나오지.
		//1 -> 3, 2 -> 3은 안돼... 3에서 한 번에 두 개를 상속 받을 수는 없어. 클래스에선 안돼.
	}

}
