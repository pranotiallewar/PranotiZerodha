package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.ZerodhaLoginPage;
import utility.Parametrization;

public class HomepageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = LaunchBrowser.chromeBrowser();
	}
	@Test
	public void ZerodhaLoginTest() throws EncryptedDocumentException, IOException

	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		String user = Parametrization.getData("CREDENTIALS",0,1);
		String pass = Parametrization.getData("CREDENTIALS",1,1);
		String pin = Parametrization.getData("CREDENTIALS",2,1);
		zerodhaLoginPage.enterUsername(user);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnSubmit();	
		//Thread.sleep(2000);	
		zerodhaLoginPage.enterpin(pin,driver);	
	    zerodhaLoginPage.clickOnContinue();
	}
	}


		



