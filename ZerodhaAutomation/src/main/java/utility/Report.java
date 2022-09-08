package utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	public static ExtentReports generateReports () {
		
		ExtentSparkReporter htmlReportor = new ExtentSparkReporter("ProjectReport.html");
		ExtentReports reports =  new ExtentReports();
		reports.attachReporter("htmlReport");
		
		
		
		
	
	}

}
