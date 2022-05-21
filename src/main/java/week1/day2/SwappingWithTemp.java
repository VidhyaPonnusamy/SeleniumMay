package week1.day2;

public class SwappingWithTemp {

	public static void main(String[] args) {
		int a = 200;
		int b = 3;
		int temp;
		
		temp = a;
		a = b;
		b= temp;
		
		System.out.println(a);
		System.out.println(b);

	}

}
