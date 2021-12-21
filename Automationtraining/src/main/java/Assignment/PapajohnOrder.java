package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PapajohnOrder {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.papajohns.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement startorder=driver.findElement(By.xpath("//*[text()='Start Your Order']"));
		startorder.click();
		Thread.sleep(3000);
		
		WebElement country=driver.findElement(By.name("country"));
		Select ob=new Select(country);
		ob.selectByValue("usa");
		
		WebElement addresstype=driver.findElement(By.name("locationType"));
		Select location=new Select(addresstype);
		location.selectByValue("HOME");
		
		WebElement streetadd=driver.findElement(By.name("input-autocomplete"));
		streetadd.sendKeys("250 cedar ridge dr, monroeville");
		/*WebElement streetaddauto=driver.findElement(By.xpath("//*[text()='250 Cedar Ridge, Monroeville, PA, USA']"));
		streetaddauto.click();*/
		
		WebElement apt=driver.findElement(By.name("aptstefloor"));
		Select ap=new Select(apt);
		ap.selectByValue("APT");
		
		WebElement aptfield=driver.findElement(By.name("residential-roomnumber"));
		aptfield.sendKeys("5A");
		
		WebElement zipfield=driver.findElement(By.name("zipcode"));
		zipfield.sendKeys("15146");
		
		WebElement submit=driver.findElement(By.xpath("//*[@class='button button-large']"));		
		submit.click();
		
		
	}

}
