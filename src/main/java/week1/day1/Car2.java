package week1.day1;

public class Car2 {

	public void applyBrake() {
		System.out.println("Applied Brake");
	}
	public void applyGear() {
		System.out.println("Applied Gear");
	}
	public void switchOnAC() {
		System.out.println("Switched on AC");
	}
	public void applyAccelerate() {
		System.out.println("Applied Accelerator");
	}
	public static void main(String[] args) {
		Car2 c2 = new Car2();
		c2.applyBrake();
		c2.applyGear();
		c2.switchOnAC();
		c2.applyAccelerate();
	}

	
}
