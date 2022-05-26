package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Vidhya");
		driver.findElement(By.id("lastNameField")).sendKeys("P");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("V");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("PA");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is interesting to save contacts");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vidhyaponnusamy95@gmail.com");
		WebElement ele_state= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sel = new Select(ele_state);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Deactivate Contact']/preceding-sibling::a[1]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is very important step");
		driver.findElement(By.xpath("//input[@value='Update'][1]")).click();
		System.out.println("Title of the page is-" + driver.getTitle());
		driver.close();
		
		
		
		
		
		
		
		

	}

}
