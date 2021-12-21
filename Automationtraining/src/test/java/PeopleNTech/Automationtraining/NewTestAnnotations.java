package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAnnotations {
  @Test
  public void f() {
	  System.out.println("This is test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is b4method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is b4class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is b4 test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
  }

  @Test
  public void f1() {
	  System.out.println("This is test f1");
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is b4 suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");
  }

  @Test
  public void f2() {
	  System.out.println("This is test f2");
  }
  
  
}
