package FaceBookPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountPage {

public WebDriver driver;
	
	//@FindBy(xpath = "//*[text()='Create new account']") WebElement Create;
	@FindBy(name = "firstname") WebElement Firstname;
	@FindBy(name = "lastname") WebElement Lastname;
	@FindBy(name = "reg_email__") WebElement Email;
	@FindBy(name = "reg_email_confirmation__") WebElement Remail;
	@FindBy(name = "reg_passwd__") WebElement Password;
	@FindBy(name = "birthday_month") WebElement Month;
	@FindBy(name = "birthday_day") WebElement Day;
	@FindBy(name = "birthday_year") WebElement Year;
	@FindBy(xpath = "(//*[@name='sex'])[2]") WebElement Gender;
	@FindBy(name = "websubmit") WebElement Submit;
	
	
		public CreateNewAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	public void firstnamesendkey() {
		Firstname.sendKeys("Mubashir");
		}
	public void lastnamesendkey() {
		Lastname.sendKeys("Ahmed");
		}
	public void emailsendkey() {
		Email.sendKeys("abcd1234@yahoo.com");
		}
	public void remailsendkey() {
		Remail.sendKeys("abcd1234@yahoo.com");
		}
	public void passwordsendkey() {
			Password.sendKeys("abcd1234");
			}
	public void monthclick() {
		Select mo = new Select(Month);
		mo.selectByValue("7");
			}
	public void dayclick() {
		Select da = new Select(Day);
		da.selectByValue("27");
	}
	public void yearclick() {
		Select ye = new Select(Year);
		ye.selectByValue("1989");
	
	}
	public void genderclick() {
		Gender.click();
	}
	public void submitclick() {
		Submit.click();
	}
	
	
	
	
	
}