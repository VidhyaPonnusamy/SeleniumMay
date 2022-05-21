package week1.day2;

public class ReverseTheDigits {

	public static void main(String[] args) {
		int input = 12345;
		int temp =0; 
		int rem;

		while(input>0) {
			rem = input%10;
			temp = rem;
			input = input/10;
		}


	}		
}


