package exam06;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementsExam implements InterFaceExam {

	@Override
	public void printStr(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

	public void printStr2(String str) {
		System.out.println("»£√‚");
	}

	public static void main(String[] args) {
		InterFaceExam ife = new ImplementsExam();
		ife.printStr("ddd");
		InterFaceExam ife2 = new PrintExam();
		ife2.printStr("ddd");

//		List list = new ArrayList();
//		list.add("sdfsdf");
//		List list2 = new LinkedList();
//		list2.add("gwegwegwr");
		
	}

}
