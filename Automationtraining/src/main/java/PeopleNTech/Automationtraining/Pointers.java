package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Pointers {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions ob=new Actions(driver);
		WebElement viewds=driver.findElement(By.id("nav-link-accountList"));
		ob.moveToElement(viewds).build().perform();
		
		Thread.sleep(3000);
		WebElement books=driver.findElement(By.linkText("Kindle Unlimited"));
		//books.click();
		ob.moveToElement(books).click().build().perform();
		
		
		
	}

}
