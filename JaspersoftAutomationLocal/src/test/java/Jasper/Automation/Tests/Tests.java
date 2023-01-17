package Jasper.Automation.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;

import Jasper.Automation.Pages.BasePage;

import Jasper.Automation.Utilities.BrowserFactory;
import Jasper.Automation.Utilities.PropertiesFile;

import Jasper.Automation.Pages.HomePage;
import Jasper.Automation.Pages.FocusHome;
import Jasper.Automation.Pages.FocusLocations;
import Jasper.Automation.Pages.shopcart;

public class Tests extends BasePage {
	
	
/********************FOCUS PAGE
 * @throws InterruptedException ***************************************/
	

	@Test
	public void Focus_test_exercise() throws InterruptedException {
			
		FocusHome focushome = PageFactory.initElements(driver, FocusHome.class);
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		FocusLocations focusLocations = PageFactory.initElements(driver, FocusLocations.class);
		
		Wait(1);
		
		homepage.searchbox.sendKeys("Focus Services");
		homepage.btnsearch.click();
		Assert.assertTrue(driver.getPageSource().contains("https://www.focusservices.com/"));
		homepage.searchresult.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", focushome.nowhiringbutton);
		focushome.AssertPage();
		focushome.Menu_locations.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", focusLocations.northamericalabel);
		focusLocations.AssertPage();
		Wait(1);
		focusLocations.centralamerica_locations.click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(), 'El Salvador & Nicaragua')]")).isDisplayed(), true);
		Wait(1);
		focusLocations.asia_locations.click();
		Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(), 'Bacolod City, Philippines')]")).isDisplayed(), true);
		
	
	     
	}
	
	
/*	@Test
	public void click_dropdown_validate_sorting() throws InterruptedException {
		String beforechange = "";
		String afterchange = "";
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		login.user.sendKeys("standard_user");
		login.pass.sendKeys("secret_sauce");
		login.loginbtn.click();
		homepage.AssertPage();
		
		beforechange = homepage.firstelement.getText();
		System.out.println(beforechange);
		homepage.changeorder(2);
		afterchange= homepage.firstelement.getText();
		System.out.println(afterchange);
		
		
		homepage.click_on_element_addcart("Sauce Labs Bolt T-Shirt");
		//homepage.shopping.click();
		driver.get("https://www.saucedemo.com/cart.html");
		Thread.sleep(5000);
		shopcart shopc= PageFactory.initElements(driver, shopcart.class);
		
		Assert.assertEquals("Sauce Labs Bolt T-Shirt", shopc. elementincart()); 
		Assert.assertNotEquals(beforechange, afterchange);  
	     
	}
	
	
	@Test
	public void Get_factorial_for_limit_value_zero() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		homepage.CalculateFactorial("0");
		Wait(1);
		Assert.assertTrue((homepage.Resultx.getText()).contains("1"));
		
		
		      
	}
	
	
	@Test
	public void Get_factorial_for_limit_value_170() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		homepage.CalculateFactorial("170");
		Wait(1);
		Assert.assertTrue((homepage.Resultx.getText()).contains("7.257415615307999e+306"));
		
		
		      
	}
	
	
	@Test
	public void Factorial_for_limit_value_171_is_Not_infinity() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		homepage.CalculateFactorial("171");
		Wait(1);
		System.out.println(homepage.Resultx.getText());
		Assert.assertTrue(!(homepage.Resultx.getText()).contains("Infinity"));
		
		      
	}
	
	@Test
	public void Check_provisional_text_for_Terms_and_condition() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		ClickOnButton(homepage.Terms);
		Assert.assertTrue(driver.getPageSource().contains("This is the terms and conditions document. We are not yet ready with it. Stay tuned!"));
		      
	}
	
	@Test
	public void Check_provisional_text_for_Privacy() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		ClickOnButton(homepage.Privacy);
		Assert.assertTrue(driver.getPageSource().contains("This is the privacy document. We are not yet ready with it. Stay tuned!"));
		      
	}

*/
	
	

	
}