package week1.day2;

public class fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i=1; i<10; i++) {
			sum= firstNum+secondNum;
			System.out.println(sum);
			firstNum= secondNum;
			secondNum =sum;
		
		}
		
		
		
		
		
	}

}
