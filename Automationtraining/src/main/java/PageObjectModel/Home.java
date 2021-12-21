package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	
	@FindBy(id = "nav-link-accountList-nav-line-1") WebElement Sign;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}	
public void SignToClick() {
	Sign.click();
}
	
}
