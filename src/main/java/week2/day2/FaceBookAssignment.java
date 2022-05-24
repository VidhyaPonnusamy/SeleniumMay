package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@id='u_2_b_lo'][1]")).sendKeys("Vidhya");
		driver.findElement(By.id("u_2_d_7j")).sendKeys("P");
		driver.findElement(By.id("u_2_g_ml")).sendKeys("1233456789");
		driver.findElement(By.id("password_step_input")).sendKeys("Vidhya@567");
		
	}

}
