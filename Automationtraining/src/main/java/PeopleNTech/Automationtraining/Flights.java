package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Flights {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Flights=driver.findElement(By.linkText("Flights"));
		Flights.click();
		Thread.sleep(3000);
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		Thread.sleep(3000);
		WebElement departuredate=driver.findElement(By.xpath("//*[@aria-label='Dec 17, 2021']"));
		departuredate.click();
		Thread.sleep(3000);
		WebElement departuredate2=driver.findElement(By.xpath("//*[@aria-label='Dec 24, 2021']"));
		departuredate2.click();
		Thread.sleep(3000);
		WebElement Donedate=driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
		Donedate.click();
		
		
	}

}
