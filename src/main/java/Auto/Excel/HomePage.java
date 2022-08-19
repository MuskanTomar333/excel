package Auto.Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="ap_email")
	WebElement user;
	@FindBy(id="continue")
	WebElement continueBtn;
	@FindBy(id="ap_password")
	WebElement pass;
	@FindBy(id="signInSubmit")
	WebElement signInBtn;
	
	public WebElement userName()
	{
		return user;
	}
	public WebElement continueBtn()
	{
		return continueBtn;
	}
	
	public WebElement passWord()
	{
		return pass;
	}
	public WebElement signInBtn()
	{
		return signInBtn;
	}
}
