package exam03;

public class Son extends Father{
	
	public Son() {
		//�� �Լ��� �ٸ��� ����Ÿ�� ����, �̰� �� ���� �ڹٰ� ������ش�
		//�̰� ����ǰ� Son s = new Son();�� �Ǵ� ��... ������.......
	}
	public void printHouse() {
		System.out.println(house);
	}
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.house);
		System.out.println(s.who);
		
		s.printHouse();
		s.doJob();
		s.who = "��";
		s.doSleep();
		
		// overriding. ��ӹ޾��� ���� ����. ���� �Լ��� ����� = �Լ��� ������
		//Ctrl + Space ��� ���� �Լ� ġ�� �ڵ� �ϼ�
		//1 -> 2 -> 3���� ����ϸ� 3���� 1, 2�� ���ÿ� �ִ� �Լ��� ���� ���� ����? 2�� ������.
		//1 -> 3, 2 -> 3�� �ȵ�... 3���� �� ���� �� ���� ��� ���� ���� ����. Ŭ�������� �ȵ�.
	}

}
