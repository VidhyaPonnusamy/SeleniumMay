package week1.day2;

public class Calculator {

	int a, b;
	double c,d;
	double e,f;
	
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public double diff(double c, double d) {
		double differ = c - d;
		return differ;
	}
	public double mul(double e, double f) {
		double mult = e * f;
		return mult;
	}
	public int div(int y, int z) {
		int divi = y/z;
		return divi;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Addition = " + cal.add(5, 3));
		System.out.println("Difference = " + cal.diff(50.2, 30.3));
		System.out.println("Multiplication = " + cal.mul(50.2, 30.3));
		System.out.println("Division = " + cal.div(50,2));

	}

}
