package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public static void main(String[] args) {
//		ArrayList<Integer> al;
//		al = new ArrayList<Integer>();
//		//ctrl shift o ������� ��
//		
//		for(int i=1;i<=5;i++) {
//			al.add(i);
//		}
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			//��� length�� �ƴ϶� size() �Լ���.
//			//Vector v = new Vector(); �̰� ������ �����ϱ�... ����ȭ�� �� �ַ�... �� ArrayList ����. 
//		}
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("0", "1");
		ArrayList<HashMap<String, String>> al;
		al = new ArrayList<HashMap<String, String>>();
		al.add(hm);
		
		hm.put("0", "31"); //"0"=key, "31"=value
//		hm.put(0, 2);
//		hm.put(0, 3);
//		hm.put(0, 4);
		System.out.println(hm.get("0"));
		
		
	}
}
