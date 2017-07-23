package exam02;

public class StringArray2 {
	int num;
	public void printStr() {
		System.out.println("함수 : printStr을 호출함");
	}
	
	public static void main(String[] args) {
		StringArray2 str2 = new StringArray2();
		str2.num = 3;
		System.out.println(str2.num);
		str2.printStr();
		
	}

}
