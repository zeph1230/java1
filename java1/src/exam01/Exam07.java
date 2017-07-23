package exam01;

public class Exam07 {
	public static void main(String[] args) {
		int num = 1;
//		System.out.println(num);
//		num = num + 1;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num+=1;
//		System.out.println(num);
//		
//		System.out.println(4%2);
//		//%는 나머지를 나타냄 mode연산자 답은 0
		//Ctrl + / 하면 한 번에 주석됨
		
		for(int i = 0;i<10;i++) {
			if(i!=0) {
				if(i%3==0) {
					System.out.println("3의 배수 : " + i);
				}
				if(i%2==0) {  
					System.out.println("2의 배수 : " + i);
				}
			}
		}
		
		
	}

}
