package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 258;
	boolean isPunctured = false;
	String bikeName = "Splendor Plus";
	double runningKM = 20000;

	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();
		System.out.println("No of wheels = " + tw.noOfWheels);
		System.out.println("No of Mirrors = " + tw.noOfMirrors);
		System.out.println("Chass is number = " + tw.chassisNumber);
		System.out.println("Is punctured? = " + tw.isPunctured);
		System.out.println("Bike Name = " + tw.bikeName);
		System.out.println("Running KM = " + tw.runningKM);
	}

}
