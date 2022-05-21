package week1.day2;

public class ArmstrongNumber {

		// 153 = (
	public static void main(String[] args) {
		int input = 153;
		int original = input;
		int temp =0;
		while(input>0) {
			int rem = input%10;
			temp = temp + (rem*rem*rem);
			input = input/10;	
		}
		System.out.println(temp);
		if(original== temp)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong number");
	}

}
