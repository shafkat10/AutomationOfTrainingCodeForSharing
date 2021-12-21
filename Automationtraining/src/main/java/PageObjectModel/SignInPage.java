package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;
	
@FindBy(name="email") WebElement Email;
@FindBy(id="continue") WebElement Continue;
@FindBy(id="createAccountSubmit") WebElement Create;
@FindBy(xpath = "//*[contains(text(), 'We cannot find an account')]") WebElement error;
public SignInPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);


}
public void EmailFieldSendKeys() {
	Email.sendKeys("ar.amsn07@gmail.com");
}
public void ContinueButtonClick() {
	Continue.click();
}
public void CreateButtonClick() {
	Create.click();
}
public String text() {
	String errorof = error.getText();
	return errorof;
}
}

