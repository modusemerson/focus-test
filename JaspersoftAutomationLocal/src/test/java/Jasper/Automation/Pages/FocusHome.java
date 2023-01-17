package Jasper.Automation.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Jasper.Automation.Pages.BasePage;

public class FocusHome extends BasePage {
	
	WebDriver driver;
	
	
	public FocusHome(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="user-name")
	public WebElement user;
	@FindBy(id="password") public WebElement pass;
	
	@FindBy(id="login-button")
	public WebElement loginbtn;
	
	@FindBy(xpath="//*[contains(text(), 'Now Hiring!')]")
	public WebElement nowhiringbutton;
	
	@FindBy(xpath="//a[@href=\"https://www.focusservices.com/locations/\"]")
	public WebElement Menu_locations;
	
	
	public void AssertPage() {
		
		Assert.assertEquals(true, nowhiringbutton.isDisplayed());
		
	
		
	}
	
	
	
	
	

}
