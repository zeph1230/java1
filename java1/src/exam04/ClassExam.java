package exam04;

public class ClassExam {
	
	String str;
	ClassExam() {
		System.out.println("�⺻������ ȣ��");
	}
	
	ClassExam(String str) {
		System.out.println("��Ʈ�� �Ķ���� ������ ȣ��");
		//ClassExam �����ڰ� �ΰ����� ������ ���� = �����ε� (6���� ������ Ÿ�� ����, 10���� ������Ÿ�� ��Ʈ��)
	}
	ClassExam(String str, int a) {
		System.out.println("���ڿ��� ����");
	}
	
	ClassExam(int a) {
		System.out.println("����");
	}
	
	public void printStr(String str) {
		System.out.println(str);
	}
	public String getStr() {
		String str = "asdf";
		return str;
	}

	public static void main(String[] args) {
		ClassExam ce = new ClassExam("");
		ClassExam ce2 = new ClassExam("���ڿ�", 0);
		ClassExam ce3 = new ClassExam(3);
		//static�� �־ Ŭ����.������ �� �� �ִ�.....................��...�׷���...
	}
}
