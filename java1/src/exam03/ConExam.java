package exam03;

public class ConExam {
	int age = 1;
	String name = "나나나";
	
	/* age 값이 20보다 작으면 10대
	 * 30보다 작으면 20대
	 * 40보다 작으면 30대
	 * 50보다 작으면 40대
	 * 60보다 작으면 50대
	 * 60 이상은 우대권 받아가세요 라고 출력
	 */
	public ConExam(int age, String name) {
		this.age = age;
		this.name = name;
		if(age<20) {
			System.out.println("10대");
		}else if(age<30) {
			System.out.println("20대");
		}else if(age<40) {
			System.out.println("30대");
		}else if(age<50) {
			System.out.println("40대");
		}else if(age<60) {
			System.out.println("50대");
		}else if(age>=60){
			System.out.println("우대권 받아가세요");
		}
		
		System.out.println(age);
		System.out.println(name);
		
		//호출할 때 여기 있는 것들을 강제로 하게 할 수 있다 -> 무조건 해야 하는 것을 넣자
	}
	
	public static void main(String[] args) {
		ConExam ce = new ConExam(20, "김");
		ConExam ce1 = new ConExam(10, "이");
		
	}
}
