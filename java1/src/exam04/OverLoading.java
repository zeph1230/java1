package exam04;

public class OverLoading {
	
	public void over(int a, String b) {
		System.out.println("ù��° �����Լ�");
	}
	public void over(String b ,int a) {
		System.out.println("�ι��� �����Լ�");
		System.out.println(0);
		System.out.println(true);
		
		//overloading -> ���� �Լ����ε� �Ķ���Ͱ� �޶�
		//������ Ÿ�� and Ÿ�� ���� and Ÿ�� ���� 
	}
	
	public void over(String c) {
		
	}
	
//	public void over(String d) {
//	�̰� String 1���� �� �Ȱ��Ƽ� ���� ��	
//	}
	
	public void over(String d, String e) {
		
	}
}
