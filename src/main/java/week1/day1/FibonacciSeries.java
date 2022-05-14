package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = -1;
		int secondNum = 1;
		int sum;

		System.out.println(firstNum);
		for(int i=0; i<=range;i++) {
			sum = firstNum+ secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
		}
	}
}


