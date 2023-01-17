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

public class FocusLocations extends BasePage {
	
	WebDriver driver;
	
	
	public FocusLocations(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	
	
	@FindBy(xpath="//a[@href=\"#north-america\"]")
	public WebElement northamerica_locations;
	
	@FindBy(xpath="//a[@href=\"#central-america\"]")
	public WebElement centralamerica_locations;
	
	@FindBy(xpath="//a[@href=\"#asia\"]")
	public WebElement asia_locations;
	
	@FindBy(xpath="//*[contains(text(), 'level talent at a cost that works for your business.')]")
	public WebElement northamericalabel;
	
	@FindBy(className="av-tab-section-tab-title-container avia-tab-title-padding-small")
	public WebElement linksdiv;
	
	
	
	/*@FindBy(id="user-name")
	public WebElement user;
	@FindBy(id="password") public WebElement pass;
	
	@FindBy(id="login-button")
	public WebElement loginbtn;*/
	
	
	
	public void AssertPage() {
		
		Assert.assertEquals(true, northamerica_locations.isDisplayed());
		Assert.assertEquals(true, centralamerica_locations.isDisplayed());
		Assert.assertEquals(true, asia_locations.isDisplayed());
		
	
		
	}
	
	
	
	
	

}
