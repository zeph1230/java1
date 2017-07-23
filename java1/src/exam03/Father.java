package exam03;

public class Father {
	
	int money = 1000;
	String car = "YF소나타";
	String house = "강남타워팰리스";
	String who = "아빠";
	
	
	
	public void printHouse() {
		System.out.println(house);
	}
	
	public void doJob() {
		System.out.println(who + " 일해");
	}
	
	public void doSleep() {
		System.out.println(who + " 잔다");
	}
//doJob(String who)에서 String who 이게 파라미터값 (인자값). 데이터타입을 꼭 선언해줘야 함.
}
