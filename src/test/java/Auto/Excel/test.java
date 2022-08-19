package Auto.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test extends base{
	@BeforeTest
	public void init()
	{
		driver=initializeDriver();
		openURL();
	}
	@Test(dataProvider="getData")
	public void Test(String user, String pass)
	{
			
			HomePage hp=new HomePage(driver);
			hp.userName().sendKeys(user);
			hp.continueBtn().click();
			hp.passWord().sendKeys(pass);
			hp.signInBtn().click();
			LandingPage lp=new LandingPage(driver);
			lp.Search().sendKeys("heels");
			lp.Box().click();
			
	}
	@DataProvider
	public Object[][] getData() throws IOException
	{
		Object[][] data=new Object[1][2];
		FileInputStream fi=new FileInputStream("./excel/excel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		data[0][0]=(long)sheet.getRow(1).getCell(0).getNumericCellValue()+""; //numeric value taken in long otherwise int(2147483647) is default which will consider it as a double value and converted numeric value to string by adding ""
		//data[0][0]="9012572026";
		data[0][1]=sheet.getRow(1).getCell(1).getStringCellValue();
		//data[0][1]="Moluramg123.";
		return data;
		
	}
	@AfterTest
	public void tearDown()
	{
		close();
	}
}
