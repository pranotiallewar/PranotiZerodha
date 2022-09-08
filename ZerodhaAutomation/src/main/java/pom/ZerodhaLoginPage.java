package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
  
	@FindBy (xpath="//input[@id='userid']")private WebElement userName;
	@FindBy (xpath="//input[@id='password']")private WebElement password;
	@FindBy (xpath="//button[@type='submit']")private WebElement submit;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account?Signup now!\"]")private WebElement signUp;
	@FindBy (xpath="//input[@id='pin']")private WebElement pin;
	@FindBy (xpath="//button[@type='submit']")private WebElement submitpin;
	
	
	public ZerodhaLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);//WE USE INITELEMENT OF PAGEFACTORY CLASS WHICH USED THE WEBDRIVER REFERENCE IN ITS ARGUMENT AND THEN WITH HELP OF
		                                      //@FINBY ANNOTATION IT WILL FIND ALL THE WEBELEMENTS DECLA
	}
		public void enterUsername(String user)
		{
			userName.sendKeys(user);
		}
		
		public void enterPassword(String pass)
		{
			password.sendKeys(pass);
		}
		
		public void clickOnSubmit()
		{
			submit.click();
		}
		public void clickOnForgot()
		{
			forgot.click();
		}
		public void clickOnsignUp()
		{
			signUp.click();
		}
		public void enterpin(String pinNumber,WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait (driver,Duration.ofMillis(2000));
			wait.until(ExpectedConditions.visibilityOf(pin));//EXPLICIT WAIT
			pin.sendKeys(pinNumber);
		}
		public void clickOnContinue()
		{
			submitpin.click();
		}
	}

