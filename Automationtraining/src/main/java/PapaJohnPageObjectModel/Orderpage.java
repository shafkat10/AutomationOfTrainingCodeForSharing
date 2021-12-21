package PapaJohnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Orderpage {
public WebDriver driver;
	
	@FindBy(name = "country") WebElement Country;
	@FindBy(name = "locationType") WebElement Location;
	@FindBy(name = "input-autocomplete") WebElement Address;
	@FindBy(name = "aptstefloor") WebElement Apt;
	@FindBy(name = "residential-roomnumber") WebElement Aptnumber;
	@FindBy(name = "zipcode") WebElement Zip;
	@FindBy(xpath = "//*[@class='button button-large']") WebElement Submit;
	
	
		public Orderpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	public void countryclick() {
		Select co = new Select(Country);
		co.selectByValue("usa");
	}
	public void locationclick() {
		Select lo = new Select(Location);
		lo.selectByValue("HOME");
	}
	public void addressclick() {
		Address.sendKeys("250 Cedar Ridge Dr, Monroeville");
	}
	public void aptclick() {
		Select ap = new Select(Apt);
		ap.selectByValue("APT");
	}
	public void numberclick() {
		Aptnumber.sendKeys("508");
	}
	public void zipclick() {
		Zip.sendKeys("15146");
	}
		public void submitclick() {
			Submit.click();	
	
	
	
	
		}	
}
