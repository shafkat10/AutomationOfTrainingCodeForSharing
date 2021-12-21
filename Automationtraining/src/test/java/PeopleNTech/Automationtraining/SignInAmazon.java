package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
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

public class SignInAmazon extends Utility{
		
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
  
  
 // @BeforeMethod
  //public void beforeMethod() throws InterruptedException {
	//  browsers("Edge", "https://www.amazon.com");
	  //browsers("Chrome");
		
		
 // }

 // @AfterMethod
  //public void afterMethod() throws InterruptedException {
	//  Thread.sleep(4000);
	 // driver.quit();
  //}


}

//https://github.com/MUHAMMADShahbazSaleem/AutomationOfTrainingCodeForSharing.git
