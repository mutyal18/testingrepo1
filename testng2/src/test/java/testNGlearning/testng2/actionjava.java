package testNGlearning.testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionjava {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		
//		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
//   	Thread.sleep(2000);
		Actions a = new Actions(driver);
//		a.dragAndDrop(driver.findElement(By.xpath("//div[@id=\"draggable\"]")),driver.findElement(By.xpath("//div[@id=\"droppable\"]"))).build().perform();
//        
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
//		a.click(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().perform();
		a.moveToElement(driver.findElement(By.id("nav-cart-count-container"))).contextClick().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Books").perform();
		String ide= driver.getWindowHandle();
		Thread.sleep(2000);
		a.click(driver.findElement(By.id("nav-search-submit-button"))).click().perform();
		Thread.sleep(2000);
		driver.switchTo().window(ide);
		Thread.sleep(2000);

	}

}
