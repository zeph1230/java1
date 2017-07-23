package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectExam {

	public static void main(String[] args) {
		
		Object o = "asdf";
		o = new HashMap();
		o = new ArrayList();
		
		ArrayList al2 = new ArrayList();
		al2.add("asdf");
		al2.add(1);
		String str = new String("123");
		String str2 = new String("123");
		System.out.println(str==str2);
		//false. 주소... 주소 달라....
		System.out.println(str.equals(str2));
		//true. 문자열 이렇게 비교하려면 .equals
		//Object 클래스를 상속받음 -> 그 안에 .equals 함수가 있음. -> 어디서든 쓸 수 있넹
		
		String str3 = "123";
		String str4 = "123";
		System.out.println(str3==str4);
		//true. 주소 같음. 
		
		
		
		
	}

}
