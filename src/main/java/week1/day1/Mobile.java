package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("I am going to call");
	}
	public void sendMsg() {
		System.out.println("I am going to send a message");
	}
	public static void main(String s[]) {
		Mobile m = new Mobile();
		m.makeCall();
		m.sendMsg();
	}
}
