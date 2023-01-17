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

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	
	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//*[contains(text(), 'Products')]") WebElement productslabel;
	@FindBy(id="inventory_container") WebElement tableelements;
	@FindBy(className="product_sort_container")
	public WebElement dropdownele;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/a/div")
	public WebElement firstelement;
	
	@FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div/div/div/div[2]/div[1]/a/div")
	List<WebElement> rows;
	
	@FindBy(className="shopping_cart_link")
	public WebElement shopping;
	
	
	@FindBy(className="//*[@id='item_1_title_link']/div")
	public WebElement elementincart;
	
	@FindBy(xpath="//html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	public WebElement searchbox;
	
	@FindBy(xpath="//input[@name=\"btnK\"]")
	public WebElement btnsearch;
	
	@FindBy(xpath="//a[@href=\"https://www.focusservices.com/\"]")
	public WebElement searchresult;
	
	

	
	
	
	/*@FindBy(xpath="//*[contains(text(), 'The greatest factorial calculator!')]") WebElement Titletxt;
	
	@FindBy(xpath="//*[contains(text(), 'Terms and Conditions')]")
	public WebElement Terms;
	
	@FindBy(xpath="//*[contains(text(), 'Privacy')]")
	public WebElement Privacy;*/
	
	
	
	
	public void AssertPage() {
		
		Assert.assertEquals(true, productslabel.isDisplayed());
		Assert.assertEquals(true, tableelements.isDisplayed());
		
	
		
	}
	
	/*public void changeorder(int num) {
		dropdownele.click();
		driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select/option["+num+"]")).click();
		
	
		
	}*/
	
	
	

	/*public void click_on_element_addcart(String ele) throws InterruptedException {
		
		int i = 1;
		String dfspxpath = "";

		for (WebElement e : rows) {
			if (ele.equals(e.getText())) {
				dfspxpath = "//*[@id='inventory_container']/div/div/div/div["+i+"]/div[2]/div[2]/button";
				break;
			}
			i++;
		}
		System.out.println(dfspxpath);
		driver.findElement(By.xpath(dfspxpath)).click();
	
		//Thread.sleep(5000);
	}*/
	
	

	
	
	
	
	
	

}
