package testNGlearning.testng2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class testpractice {
//	public static void main(String[] args) throws InterruptedException 
//	{	
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
//		practice login =new practice(driver);
//		login.typeusername();
//		login.typepassword();
//		login.clicklogin();
//		
//	}
	
	@Test
	public void verifyvalidlogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		practice login =new practice(driver);
		login.typeusername();
		login.typepassword();
		login.clicklogin();
	}

}
