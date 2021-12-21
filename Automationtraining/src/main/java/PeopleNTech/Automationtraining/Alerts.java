package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Simplealert=driver.findElement(By.id("alertButton"));
		Simplealert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement Timeralert=driver.findElement(By.id("timerAlertButton"));
		Timeralert.click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement Confirmalert=driver.findElement(By.id("confirmButton"));
		Confirmalert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement Confirmalertcancel=driver.findElement(By.id("confirmButton"));
		Confirmalertcancel.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
	}

}
