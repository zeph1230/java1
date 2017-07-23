package exam01;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("니가 생각하는 숫자");
		String str = scan.nextLine();
		
		int inputNum = Integer.parseInt(str);
		
		
		if(inputNum==1) {
			System.out.println("1이군");
		}
		else if(inputNum==2) {
			System.out.println("2다");
		}
		else {
			System.out.println("둘다 아니네");
		}
		
	}

}
