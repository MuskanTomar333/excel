package Auto.Excel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
WebDriver driver;
public WebDriver initializeDriver(){
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
return driver;
	}
public void openURL()
{
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
}
public String Screenshot(WebDriver driver,String testCaseName) throws IOException
{
	TakesScreenshot screen=(TakesScreenshot)driver;
	File src=screen.getScreenshotAs(OutputType.FILE);
	String dest="./screenshot/"+testCaseName+".png";
	FileUtils.copyFile(src,new File(dest));
	return dest;
	
}
public void close()
{
	driver.close();
}
}
