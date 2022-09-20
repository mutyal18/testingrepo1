package testNGlearning.testng2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class practice {
	/**
	 * 
	 */
	

	

	/**
	 * @author 
	 * POM without page factory
	 * THis class will store all the locater and method of login 
	 *
	 */
	
		
		WebDriver driver;
	//	
//		(WebElement) By.name("username");
//		(WebElement) By.name("password");
//		(WebElement) By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	//	
//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

//		By username = By.xpath("//*[@name='username']");
//		By password = By.xpath("//*[@name='password']");
//		By login = By.xpath("//*[text()=' Login ']");

		
		public practice(WebDriver driver) 
		{
			this.driver=driver;
		}
		public void typeusername()
		{
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
			//username.sendKeys("Admin");
		}
		public void typepassword() 
		{
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
			//password.sendKeys("admin123");
		}
		public void clicklogin()
		{
			driver.findElement(By.xpath("//*[text()=' Login ']")).click();
			//login.click();
		}
	}



