package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	public WebDriver driver;
	
	@FindBy(id="ap_customer_name") WebElement Name;
	@FindBy(id="ap_email") WebElement Mobile;
	@FindBy(id="ap_password") WebElement Password;
	@FindBy(id="ap_password_check") WebElement Repassword;
	@FindBy(id="continue") WebElement Continue;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public void YournameSendKeys() {
		Name.sendKeys("Mubashir");
	}
	public void MobileSendKeys() {
		Mobile.sendKeys("abc@yahoo.com");
	}
	public void PasswordSendKeys() {
		Password.sendKeys("abcd1234");
	}
	public void RetypePassSendKeys() {
		Repassword.sendKeys("abcd1234");
	}
	public void ContinueButtonClick() {
		Continue.click();
	}
	
}
