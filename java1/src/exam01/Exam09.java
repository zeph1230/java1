package exam01;

public class Exam09 {
	public static void main(String[] args) {
		
		int[] bank = new int[20];
		//여러 개 공간 만들 때 new를 써서 확보
		for(int i=0;i<=bank.length-1;i++) {
			//length가 20인데 0부터라 19번까지라서 -1
			bank[i] = i+1;
			
		}
		for(int i=0;i<=bank.length-1;i++) {
			System.out.println(bank[i]);
		}
	}

}
