package exam01;

public class Exam11 {
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1)*2;
		}
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		
	}

}
