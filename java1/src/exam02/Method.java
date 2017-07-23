package exam02;

public class Method {

	int[] num1 = new int[10];
	
	public void setNum1(int num1) {
		System.out.println(num1);
	}
	
	public int[] getNum1() {
		return num1;
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		method.setNum1(3);
		int[] a = method.getNum1();
		System.out.println(a);
		String str = "주소값";
		System.out.println(str);
		System.out.println(method);
		
		//배열변수 a만 찍으면 [I@15db9742 라고 나오는데 이게 메모리(RAM) 주소임
		//클래스(정해져있지 않은 데이터 타입 (String 제외) 찍으면 메모리 주소 나온다
		//String str2 = new String("이렇게") 원래는 이렇게 써야해
	}
}
