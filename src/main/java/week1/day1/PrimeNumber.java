package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 81;
		boolean flag = false;
		int rem;

		for(int i=2; i<input/2; i++) {
			rem = input%i;
			if(rem==0) {
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println("Given input " + input + " is not a prime number");
		else
			System.out.println("Given input " + input + " is a prime number");
	}
}
