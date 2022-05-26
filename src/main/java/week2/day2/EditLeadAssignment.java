package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Lead ID:']//following::input[2]")).sendKeys("Neepa");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String firstLead_ID = driver.findElement(By.xpath("//div[text()='Lead ID']//following::tr[1]//a[1]")).getText();
		driver.findElement(By.xpath("//div[text()='Lead ID']//following::tr[1]//a[1]")).click();
		String expectedTitle = "View Lead | opentaps CRM";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
			System.out.println("Its an expected Title");
		else
			System.out.println("Its not the same expected Title");
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']/following-sibling::a[2]")).click();
		String actualCompanyName = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CHANGEDDD");
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The Updated Company Name is  " + updatedCompanyName );
		driver.close();

	}

}
