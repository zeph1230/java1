package exam04;

public class FunctionExam2 {
	
	public void printStr1(Person str) {
		str.doWork();
		System.out.println("�Ű����� �ִ� �Լ�" + str);
	}
	
	public void printStr1(int str) {
		System.out.println("��Ʈ �Ű����� �ִ� �Լ�" + str);
		
	}
	
	protected void printStr1() {
		System.out.println("�Ű����� ���� �Լ�");
		
	}
	
	public static void main(String[] args) {
		FunctionExam2 fe = new FunctionExam2();
		fe.printStr1(new Student());
		
		BizMan bm = new BizMan();
		fe.printStr1(new BizMan());
		fe.printStr1(bm);
		
		Person p = new Person();
		fe.printStr1(p);
		
		int a = 3;
		fe.printStr1(a);
		fe.printStr1(2);
		fe.printStr1();
	}

}
