package exam04;

public class Modifier {

	public int pubNum;
	//얘는 모든 곳에서 됨
	private int priNum;
	//얜 아무데서도 안돼
	int defNum;
	//default는 다른 패키지에서는 접근할 수 없다. 상속 받아도 패키지 다르면 안돼
	protected int proNum;
	//protected는 다른 패키지에서도 상속을 받으면 가능. 같은 패키지는 당연 가능
}
