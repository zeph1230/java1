package exam04;

public class ClassExam {
	
	String str;
	ClassExam() {
		System.out.println("기본생성자 호출");
	}
	
	ClassExam(String str) {
		System.out.println("스트링 파라미터 생성자 호출");
		//ClassExam 생성자가 두개지만 가능한 이유 = 오버로딩 (6행은 데이터 타입 없음, 10행은 데이터타입 스트링)
	}
	ClassExam(String str, int a) {
		System.out.println("문자열과 숫자");
	}
	
	ClassExam(int a) {
		System.out.println("숫자");
	}
	
	public void printStr(String str) {
		System.out.println(str);
	}
	public String getStr() {
		String str = "asdf";
		return str;
	}

	public static void main(String[] args) {
		ClassExam ce = new ClassExam("");
		ClassExam ce2 = new ClassExam("문자열", 0);
		ClassExam ce3 = new ClassExam(3);
		//static이 있어서 클래스.변수로 쓸 수 있다.....................네...그렇대...
	}
}
