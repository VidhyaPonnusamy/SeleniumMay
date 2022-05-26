package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAssignment {

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
		String first_LeadName= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String expectedTitle = "Duplicate Lead | opentaps CRM";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
			System.out.println("Its a Duplicated Lead Title");
		else
			System.out.println("Its not the same expected Title");
		
		driver.findElement(By.name("submitButton")).click();
		String dup_LeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("New Lead ID is  " + driver.findElement(By.id("viewLead_companyName_sp")).getText());
		if(dup_LeadName.equals(first_LeadName))
			System.out.println("Lead is Duplicated!");
		else
			System.out.println("Lead is NOT Duplicated! Check Again!");
	}
}
