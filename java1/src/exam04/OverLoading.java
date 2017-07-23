package exam04;

public class OverLoading {
	
	public void over(int a, String b) {
		System.out.println("첫번째 오버함수");
	}
	public void over(String b ,int a) {
		System.out.println("두번쨰 오버함수");
		System.out.println(0);
		System.out.println(true);
		
		//overloading -> 같은 함수명인데 파라미터가 달라
		//데이터 타입 and 타입 갯수 and 타입 순서 
	}
	
	public void over(String c) {
		
	}
	
//	public void over(String d) {
//	이건 String 1개인 게 똑같아서 에러 남	
//	}
	
	public void over(String d, String e) {
		
	}
}
