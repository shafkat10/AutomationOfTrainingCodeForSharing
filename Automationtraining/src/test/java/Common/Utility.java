package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Utility {
public WebDriver driver; 
@Parameters({"browser", "website"})
  @BeforeMethod
  public void beforeMethod(String browser, String website) throws InterruptedException {
	  
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

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
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
