package exam04;

import exam01.Exam01;

public class FunctionExam {
	
	public void printStr1(String str) {
		System.out.println(str);
	}
	
	protected void printStr2(String str, int a) {
		System.out.println(str);
		
	}
	
	void printStr3(String str) {
		System.out.println(str);
		
	}
	
	private void printStr4(String str) {
		System.out.println(str);
	
	}
	
	
	public static void main(String[] args) {
		Exam01 ex1 = new Exam01();
	}
	//다른 클래스 가져올 때는 같은 패키지에 있으면 상관 없는데 아니면 import 해줘야 해 ctrl shift O 해줘
	//다른 클래스에만 이 이름이 여러개면 고르라고 하네
}
