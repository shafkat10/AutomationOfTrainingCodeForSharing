package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
				Thread.sleep(3000);
		WebElement CreateAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAccount.click();
		Thread.sleep(3000);
		WebElement BirthMonth=driver.findElement(By.name("birthday_month"));
		Select ob = new Select(BirthMonth);
		ob.selectByValue("1");
		Thread.sleep(3000);
		WebElement BirthDay=driver.findElement(By.name("birthday_day"));
		Select birth = new Select(BirthDay);
		birth.selectByVisibleText("6");
		Thread.sleep(3000);
		WebElement BirthYear=driver.findElement(By.name("birthday_year"));
		Select year = new Select(BirthYear);
		year.selectByValue("1989");
		Thread.sleep(3000);
		WebElement Gender=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		Gender.click();
		
		
		
		
		
		
		
		
		
		
		/*WebElement fields=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		fields.sendKeys("Mubashir");
		WebElement passfields=driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
		passfields.sendKeys("123456");
		WebElement login=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
		login.click();
		WebElement button=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		button.click();*/
		
	}

}
