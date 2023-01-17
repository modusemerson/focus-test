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

public class shopcart extends BasePage {
	
	WebDriver driver;
	
	
	public shopcart(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	/*
	
	@FindBy(className="//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/a/div")
	public WebElement elementincart;
	

	
	public String elementincart() throws InterruptedException {
		String text;
    
		text= driver.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/a/div")).getText();
	
		return text;
	}
	*/
	

}
