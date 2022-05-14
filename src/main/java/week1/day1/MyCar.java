package week1.day1;

public class MyCar extends Car2{

	public static void main(String[] args) {
		Car2 c = new Car2();
		System.out.println("Without Inheritance:");
		c.applyBrake();
		c.applyGear();
		c.switchOnAC();
		c.applyAccelerate();
		
		System.out.println("Inheritance:");
		MyCar obj = new MyCar();
		obj.applyAccelerate();
		obj.applyBrake();
		obj.applyGear();
		obj.switchOnAC();
	}

}
