package exam01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작값");
		String initStr = scan.nextLine();
		int initNum = Integer.parseInt(initStr);
		
		System.out.println("최대값");
		String initStr2 = scan.nextLine();
		int initNum2 = Integer.parseInt(initStr2);
		
		
		int num = 0;
		
		for(int i=initNum;i<=initNum2;i++) {
			
			if(i%3==0 || i%2==0) {
				num += i;
			}
		}
		System.out.println(num);
		
		
	}
	
}
