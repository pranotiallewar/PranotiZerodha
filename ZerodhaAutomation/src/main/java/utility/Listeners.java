package utility;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends  BaseTest implements ITestListener {
	//webDriver driver;
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started" + result.getName());
		
	}
	
	public void onTestsuccess(ITestResult result) {
		System.out.println("Test Passed" + result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.takeScreenShot(driver,result.getName());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			public void onTestSkipped(ITestResult result) {
				System.out.println("Test skipped" + result.getName());
				
			
			
		}
	
	}


