package Auto.Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextboxx']")
	WebElement search;
	@FindBy(id="nav-search-submit-button")
	WebElement searchBox;
	public WebElement Search()
	{
		return search;
	}
	public WebElement Box()
	{
		return searchBox;
	}
	
}
