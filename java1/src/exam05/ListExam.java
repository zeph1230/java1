package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public static void main(String[] args) {
//		ArrayList<Integer> al;
//		al = new ArrayList<Integer>();
//		//ctrl shift o 눌러줘야 함
//		
//		for(int i=1;i<=5;i++) {
//			al.add(i);
//		}
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			//얘는 length가 아니라 size() 함수로.
//			//Vector v = new Vector(); 이거 쓰지마 느리니까... 동기화가 된 애래... 걍 ArrayList 쓰셈. 
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
