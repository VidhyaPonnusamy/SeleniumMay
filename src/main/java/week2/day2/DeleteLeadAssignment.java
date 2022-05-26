package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String first_LeadID = driver.findElement(By.xpath("//div[text()='Lead ID']/following::tr[1]//a[1]")).getText();
		driver.findElement(By.xpath("//div[text()='Lead ID']/following::tr[1]//a[1]")).click();
		//driver.findElement(By.xpath("a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']/following-sibling::a[3]")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(first_LeadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		String expectedMessage = "No records to display";
		String actualMessage = driver.findElement(By.xpath("//button[text()='Export To Excel']/following::div[1]")).getText();

		if(expectedMessage.equals(actualMessage))
			System.out.println(actualMessage);
		else
			System.out.println("Values are not matching as expected");
	}

}
