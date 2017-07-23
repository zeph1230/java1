package exam05;

public class StringExam {
	
	String str1 = "123";
	
	public static void main(String[] args) {
		
		StringExam se = new StringExam();
		
		String str2 = "123";
		String str3 = new String("123");
		String str4 = "123";
		
		System.out.println(se.str1==str2);
		System.out.println(se.str1==str3);
		System.out.println(se.str1==str4);
		System.out.println(str2==str4);
		System.out.println(se.str1.equals(str3));
		System.out.println(str2==str3);
		
		
	}

}
