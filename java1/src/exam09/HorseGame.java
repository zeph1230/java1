package exam09;

import java.util.ArrayList;
import java.util.List;

public class HorseGame extends Thread{
	public Horse h;
	static int idx= 0; //이렇게 static으로 선언해서 등수 매기면 ㄴㄴ해... 위험해...
	public HorseGame(Horse h) {
		this.h = h;
	}
	public void run() {
		h.startHorse();
		try {
			Thread.sleep(h.speed); //괄호에 숫자가 들어가면 단위는 ms라서 1000ms = 1sec. 대기해!
			h.runningHorse();
		}catch(Exception e) {
			e.printStackTrace();
		}
		h.endHorse(++idx); 
	}
	public static void main(String[] args) {
		String[] horseNames = {"ㄱㄱ", "ㄴㄴ", "ㄷㄷ", "ㄹㄹ", "ㅁㅁ"};
		List<HorseGame> horseList = new ArrayList<HorseGame>();
		for(int i=0;i<horseNames.length;i++) {
			int speed = (int)(Math.random()*3000) + 1000;
			Horse h = new Horse(speed, horseNames[i]);
			HorseGame hg = new HorseGame(h);
			hg.start();
			horseList.add(hg);
//			try {
//				hg.join(); //이거 쓰면 이거 다 할 때까지 다른 거 하지마 = 동기화
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		for(HorseGame hg : horseList) {
			try {
				hg.join(); 
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("끝");
	}
}

