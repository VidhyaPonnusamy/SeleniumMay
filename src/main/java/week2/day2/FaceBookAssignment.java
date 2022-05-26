package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vidhya");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("vidhyaponnusamy95@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vidhya2123");
		WebElement ele_Day = driver.findElement(By.name("birthday_day"));
		Select sel_ele_Day = new Select(ele_Day);
		sel_ele_Day.selectByVisibleText("28");
		WebElement ele_Month = driver.findElement(By.name("birthday_month"));
		Select sel_ele_Month = new Select(ele_Month);
		sel_ele_Month.selectByVisibleText("Mar");
		WebElement ele_Year = driver.findElement(By.name("birthday_year"));
		Select sel_ele_Year = new Select(ele_Year);
		sel_ele_Year.selectByVisibleText("1998");
		driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label[1]")).click();
		driver.close();
	}

	
}
