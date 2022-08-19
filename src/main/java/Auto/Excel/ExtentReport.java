package Auto.Excel;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
static ExtentReports reports;
public static ExtentReports TestReports()
{
	Date d=new Date();
	SimpleDateFormat t=new SimpleDateFormat("dd-MM-yyyy");
	String date=t.format(d);
	ExtentSparkReporter spark=new ExtentSparkReporter("./reports/"+date+".html");
	spark.config().setDocumentTitle("Amazon");
	reports=new ExtentReports();
	reports.attachReporter(spark);
	reports.setSystemInfo("Tester", "Muskan Tomar");
	return reports;
	
}
}
