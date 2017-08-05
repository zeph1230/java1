package exam08;

import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		Exam e = new Exam();
		e.print();
		e.print("ddd");
		try {
			Class cls = Class.forName("exam08.Exam");
			Method[] m = cls.getDeclaredMethods();
			for(int i=0;i<m.length;i++) {
				System.out.println(m[i].toString());
			}
			Exam ex = (Exam)cls.newInstance(); //newInstance(); �ϸ� new Exam();�� ����. �ٵ� �ӵ��� ���� ���� ����. ����...����..
			ex.print();
			Method pMethod = cls.getMethod("print", String.class);
			pMethod.invoke(ex,  "dddfff");
			
			
			
		} catch (Exception ec) {
			System.out.println(ec);
		}
	}
}
