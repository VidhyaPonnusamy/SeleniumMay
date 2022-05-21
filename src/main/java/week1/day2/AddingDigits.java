package week1.day2;

public class AddingDigits {

	public static void main(String[] args) {
		int input = 268;
		int temp = 0;

		while(input>0) {
			int rem = input%10; //8 6 2 
			temp = (temp*10) + rem; //(0*10)+8=8 (8*10)+6 = 86  86*10+2= 862 
			input = input / 10;
		}

		System.out.println(temp);


	}

}
