package exam02;

public class Person {
	String name;
	String address;
	String job;
	
	public void doJob() {
		System.out.println(name + "���� " + job + "�� �ϰ� �ֽ��ϴ�.");
	}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", "������");
		
		p.doJob();
	}
}
