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
		//false. �ּ�... �ּ� �޶�....
		System.out.println(str.equals(str2));
		//true. ���ڿ� �̷��� ���Ϸ��� .equals
		//Object Ŭ������ ��ӹ��� -> �� �ȿ� .equals �Լ��� ����. -> ��𼭵� �� �� �ֳ�
		
		String str3 = "123";
		String str4 = "123";
		System.out.println(str3==str4);
		//true. �ּ� ����. 
		
		
		
		
	}

}
