package exam09;

public class StaticExam {
	
	static int publicNum = 0;
	int privateNum = 0;
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		se.publicNum = 1;
		se.privateNum = 1;
		System.out.println(se.publicNum);
		System.out.println(se.privateNum);
		
		StaticExam se2 = new StaticExam();
		se2.publicNum = 2;
		se2.privateNum = 2;
		System.out.println(se.publicNum);
		System.out.println(se.privateNum);
		
		System.out.println(StaticExam.publicNum); // 보통 이렇게 쓴다 new StaticExam 이런거 안 해도 됨
		
	}

}
