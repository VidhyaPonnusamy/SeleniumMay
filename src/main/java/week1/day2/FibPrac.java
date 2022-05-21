package week1.day2;

public class FibPrac {

	public static void main(String[] args) {
		int a =0;
		int b=1;
		int inp=8;
		
		for(int i =0; i<=inp; i++) {
			int temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
		}
	}

}
