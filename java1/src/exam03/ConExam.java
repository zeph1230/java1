package exam03;

public class ConExam {
	int age = 1;
	String name = "������";
	
	/* age ���� 20���� ������ 10��
	 * 30���� ������ 20��
	 * 40���� ������ 30��
	 * 50���� ������ 40��
	 * 60���� ������ 50��
	 * 60 �̻��� ���� �޾ư����� ��� ���
	 */
	public ConExam(int age, String name) {
		this.age = age;
		this.name = name;
		if(age<20) {
			System.out.println("10��");
		}else if(age<30) {
			System.out.println("20��");
		}else if(age<40) {
			System.out.println("30��");
		}else if(age<50) {
			System.out.println("40��");
		}else if(age<60) {
			System.out.println("50��");
		}else if(age>=60){
			System.out.println("���� �޾ư�����");
		}
		
		System.out.println(age);
		System.out.println(name);
		
		//ȣ���� �� ���� �ִ� �͵��� ������ �ϰ� �� �� �ִ� -> ������ �ؾ� �ϴ� ���� ����
	}
	
	public static void main(String[] args) {
		ConExam ce = new ConExam(20, "��");
		ConExam ce1 = new ConExam(10, "��");
		
	}
}
