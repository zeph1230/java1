package exam01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("���̵� �Է����ּ���");
		String id  = s.nextLine();
			
		System.out.println("��й�ȣ�� �Է����ּ���");
		System.out.println("�� ��й�ȣ�� ���ڸ� �Է��ϼž� �մϴ�");
		
		String pwd = s.nextLine();
		int pwdNum = 0;
		//try ���Ŀ� ����� �� ���� �� ������ �켱 �������ְ� �ʱ�ȭ ��Ű��. �������� try ������ ���� �ȵǰ� 0�� ��������
		try {
			pwdNum = Integer.parseInt(pwd);
		}catch(Exception e) {
			System.out.println("����� ���");
		}
		System.out.println("�Է��Ͻ� ���̵� = "+ id);
		System.out.println("�Է��Ͻ� ��й�ȣ = "+ pwd);
		System.out.println("�Է��Ͻ� ���� ��й�ȣ = "+ pwdNum);
		
		//���� �ּ�
		/*������ �ּ�
		 ������ 
		 */
		
	}
}
