package exam01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String id  = s.nextLine();
			
		System.out.println("비밀번호를 입력해주세요");
		System.out.println("단 비밀번호는 숫자만 입력하셔야 합니다");
		
		String pwd = s.nextLine();
		int pwdNum = 0;
		//try 이후에 출력할 때 에러 안 나려면 우선 선언해주고 초기화 시키고. 에러나도 try 때문에 종료 안되고 0이 나오겠지
		try {
			pwdNum = Integer.parseInt(pwd);
		}catch(Exception e) {
			System.out.println("제대로 써라");
		}
		System.out.println("입력하신 아이디 = "+ id);
		System.out.println("입력하신 비밀번호 = "+ pwd);
		System.out.println("입력하신 숫자 비밀번호 = "+ pwdNum);
		
		//한줄 주석
		/*여러줄 주석
		 뫄뫄뫄 
		 */
		
	}
}
