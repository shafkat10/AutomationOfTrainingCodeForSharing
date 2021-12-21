package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
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
		WebElement firstnamefield=driver.findElement(By.name("firstname"));
		firstnamefield.sendKeys("Mubashir");
		Thread.sleep(1000);
		WebElement lastnamefield=driver.findElement(By.name("lastname"));
		lastnamefield.sendKeys("Ahmed");
		Thread.sleep(1000);
		WebElement mobilefield=driver.findElement(By.name("reg_email__"));
		mobilefield.sendKeys("123456@gmail.com");
		Thread.sleep(1000);
		WebElement remobilefield=driver.findElement(By.name("reg_email_confirmation__"));
		remobilefield.sendKeys("123456@gmail.com");
		Thread.sleep(1000);
		
		WebElement passfield=driver.findElement(By.name("reg_passwd__"));
		passfield.sendKeys("123456789");
		
		Thread.sleep(1000);
		WebElement birthmonth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(birthmonth);
		ob.selectByValue("7");
		Thread.sleep(1000);
		WebElement birthday=driver.findElement(By.name("birthday_day"));
		Select oc=new Select(birthday);
		oc.selectByValue("27");
		Thread.sleep(1000);
		WebElement birthyear=driver.findElement(By.name("birthday_year"));
		Select od=new Select(birthyear);
		od.selectByValue("1989");
		
		Thread.sleep(1000);
		WebElement gender=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		
		Thread.sleep(1000);
		WebElement signupbutton=driver.findElement(By.name("websubmit"));
		signupbutton.click();
		
		
		
	}

}
