package exam02;

public class Method {

	int[] num1 = new int[10];
	
	public void setNum1(int num1) {
		System.out.println(num1);
	}
	
	public int[] getNum1() {
		return num1;
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		method.setNum1(3);
		int[] a = method.getNum1();
		System.out.println(a);
		String str = "�ּҰ�";
		System.out.println(str);
		System.out.println(method);
		
		//�迭���� a�� ������ [I@15db9742 ��� �����µ� �̰� �޸�(RAM) �ּ���
		//Ŭ����(���������� ���� ������ Ÿ�� (String ����) ������ �޸� �ּ� ���´�
		//String str2 = new String("�̷���") ������ �̷��� �����
	}
}
