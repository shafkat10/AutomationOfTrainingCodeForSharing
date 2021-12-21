package PapaJohnPageObjectModel;

import org.testng.annotations.Test;

import FaceBookPageObjectModel.CreateNewAccountPage;
import PapaJohnPageObjectModel.Homepage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Order {
	public WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  Homepage ab =new Homepage(driver);
	  Thread.sleep(3000);
	  ab.StartClick();
	  
	  Orderpage ct=new Orderpage(driver);
	  Thread.sleep(3000);
	  ct.countryclick();
	  ct.locationclick();
	  ct.addressclick();
	  ct.aptclick();
	  ct.numberclick();
	  ct.zipclick();
	  ct.submitclick();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.papajohns.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
