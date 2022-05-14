package week1.day1;

public class PrimeNumberOwnLogic {
	
	public static void main(String args[])
	{
		int n = 13;
		
		if(n%2==0 || n%3==0 || n%5==0 || n%7==0)
			System.out.println("Given number is not a prime number: " +n);
		else
			System.out.println("Given number is a prime number: " +n);
	}

}
