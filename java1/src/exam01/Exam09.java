package exam01;

public class Exam09 {
	public static void main(String[] args) {
		
		int[] bank = new int[20];
		//���� �� ���� ���� �� new�� �Ἥ Ȯ��
		for(int i=0;i<=bank.length-1;i++) {
			//length�� 20�ε� 0���Ͷ� 19�������� -1
			bank[i] = i+1;
			
		}
		for(int i=0;i<=bank.length-1;i++) {
			System.out.println(bank[i]);
		}
	}

}
