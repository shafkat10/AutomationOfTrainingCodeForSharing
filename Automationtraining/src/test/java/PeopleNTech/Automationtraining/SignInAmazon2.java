package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.CreateAccountPage;
import PageObjectModel.Home;
import PageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SignInAmazon2 {
	public WebDriver driver;
	
  @Test(priority = 1, dependsOnMethods = "verificationofText")
  public void f() throws InterruptedException {
	  Home ob=new Home(driver);
	  Thread.sleep(3000);
	  ob.SignToClick();
	  
	  SignInPage it=new SignInPage(driver);
	  Thread.sleep(3000);
	  it.EmailFieldSendKeys();
	  Thread.sleep(3000);
	  it.ContinueButtonClick();
	  //it.CreateButtonClick();
	  
	  //CreateAccountPage ct=new CreateAccountPage(driver);
	  //Thread.sleep(3000);
	  //ct.YournameSendKeys();
	  //ct.MobileSendKeys();
	  //ct.PasswordSendKeys();
	  //ct.RetypePassSendKeys();
	  //ct.ContinueButtonClick();
	  
  }
  @Test(priority = 2)
  public void verificationofText() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  Thread.sleep(3000);
	  ob.SignToClick();
	  shots();
	  SignInPage it=new SignInPage(driver);
	  Thread.sleep(3000);
	  //it.EmailFieldSendKeys();
	 // Thread.sleep(3000);
	  //it.ContinueButtonClick();
	  it.EmailFieldSendKeys();
	  Thread.sleep(2000);
	  it.ContinueButtonClick();
	  shots();
	  String errorit = it.text();
	  System.out.println(errorit);
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(errorit, "We cannot find an account with that email address");
	  //Assert.assertEquals(errorit, "we cannot find you");
	  System.out.println("this is after assertion");
	  soft.assertAll();
	  
	  
	  //CreateAccountPage ct=new CreateAccountPage(driver);
	  //Thread.sleep(3000);
	  //ct.YournameSendKeys();
	  //ct.MobileSendKeys();
	  //ct.PasswordSendKeys();
	  //ct.RetypePassSendKeys();
	  //ct.ContinueButtonClick();
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  browsers("Edge", "https://www.amazon.com");
	  //browsers("Chrome");
		
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.quit();
  }
public void browsers(String browser, String website) throws InterruptedException {
	String local = System.getProperty("user.dir");
	System.out.println(local);
		
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", local + "\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(website);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}else if (browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", local + "\\src\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.navigate().to(website);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}else {
		System.out.println("Correct browser name");
	}
}
 public void shots() throws IOException {
	 Date dt = new Date();
	 System.out.println(dt);
	 String it=dt.toString().replace(" ", "_").replace(":", "_");
	 System.out.println(it);
	 String local = System.getProperty("user.dir");
	File stored = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(stored, new File(local + "\\pictures\\"+it+"capture.jpg"));
 } 
}

//https://github.com/MUHAMMADShahbazSaleem/AutomationOfTrainingCodeForSharing.git
