package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement create_new_btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create_new_btn.click();	
		
		WebElement first_name_fb = driver.findElement(By.xpath("//input[@name='firstname']"));
		first_name_fb.sendKeys("Rama");
	
		WebElement last_name_fb = driver.findElement(By.xpath("//input[@name='lastname']"));
		last_name_fb.sendKeys("Krishnan");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']")); //reg_email_confirmation__
		email.sendKeys("ramkrish2010@gmail.com");
		
		WebElement reemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")); //reg_email_confirmation__
		reemail.sendKeys("ramkrish2010@gmail.com");
		
			
		WebElement pwd = driver.findElement(By.xpath("//input[@data-type='password']"));
		pwd.sendKeys("nopassword");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("20");
		
		WebElement monthElement = driver.findElement(By.id("month"));
		Select month = new Select(monthElement);
		month.selectByVisibleText("oct");
		
		WebElement yearElement = driver.findElement(By.id("year"));
		Select year = new Select(yearElement);
		year.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		
		driver.findElement(By.name("websubmit")).click();
			
	}
	

}

		
		