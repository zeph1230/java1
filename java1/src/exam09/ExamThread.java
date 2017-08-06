package exam09;

import java.util.Random;

public class ExamThread extends Thread {
	
	int threadId;
	
	public ExamThread(int threadId) {
		this.threadId = threadId;
	}
	
	public void run() {
		System.out.println("난" + this.threadId + " ID 쓰레드 시작점"); //이건 내가 찍는 순서가 있어. 얘네가 처리하는 순서는 모르지 
		try {
			int time = (int)(Math.random()*3000)+1;			
			Thread.sleep(time); //time에 숫자가 들어가면 단위는 ms라서 1000ms = 1sec. 대기해!
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("난" + this.threadId + " ID 쓰레드 종료점");
		//쓰레드 시작점 찍고 1초 후에 쓰레드 종료점 찍는다
		//종료엔 순서가 없음
	}
	public static void main(String[] args) {
		System.out.println("시작점");
		
		ExamThread eh1 = new ExamThread(1);
		eh1.start(); //start해줘야 동작함
		ExamThread eh2 = new ExamThread(2);
		ExamThread eh3 = new ExamThread(3);
		ExamThread eh4 = new ExamThread(4);
		ExamThread eh5 = new ExamThread(5);
		ExamThread eh6 = new ExamThread(6);
		ExamThread eh7 = new ExamThread(7);
		ExamThread eh8 = new ExamThread(8);
		ExamThread eh9 = new ExamThread(9);
		ExamThread eh10 = new ExamThread(10);
		eh2.start();
		eh3.start();
		eh4.start();
		eh5.start();
		eh6.start();
		eh7.start();
		eh8.start();
		eh9.start();
		eh10.start();
		System.out.println("종료점"); //이거 몇 번째에 찍힐지 몰라 
	}

}
