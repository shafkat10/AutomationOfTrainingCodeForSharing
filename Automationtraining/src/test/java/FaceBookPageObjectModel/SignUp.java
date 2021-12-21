package FaceBookPageObjectModel;

import org.testng.annotations.Test;

import PageObjectModel.CreateAccountPage;
import PageObjectModel.Home;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignUp {
	public WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  Homepage ob=new Homepage(driver);
	  Thread.sleep(3000);
	  ob.CreateClick();
	  
	  CreateNewAccountPage ct=new CreateNewAccountPage(driver);
	  Thread.sleep(3000);
	  ct.firstnamesendkey();
	  ct.lastnamesendkey();
	  ct.emailsendkey();
	  ct.remailsendkey();
	  ct.passwordsendkey();
	  ct.monthclick();
	  ct.dayclick();
	  ct.yearclick();
	  ct.genderclick();
	  ct.submitclick();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
