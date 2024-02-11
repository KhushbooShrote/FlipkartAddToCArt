package pageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCrt 
{
	WebDriver driver;
	By groceryLocator=By.xpath("//img[@alt='Grocery']");
	By staplesLocator=By.xpath("//div[@class='eFQ30H'][1]");
	By dalsandpulsesLocator=By.linkText("Dals & Pulses");
	By additemstocartLocator=By.xpath("//span[contains(text(),'Add Item')]");
	By addtocartButtonLocator=By.xpath("//a[@class='_3SkBxJ']");
	By placeorderLocator=By.xpath("//span[contains(text(),'Place Order')]");

	public void goToLandingPage()
	{
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().alert().sendKeys("411028");
	}
	public void clickedOnGrocery()
	{
		driver.findElement(groceryLocator).click();
	}
	public void hoverOnStaples()
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(dalsandpulsesLocator)).build().perform();
	}
	public void clickOnDalsAndPulses()
	{
		driver.findElement(dalsandpulsesLocator).click();;
	}
	public void addItemsToCart()
	{ 
		List<WebElement> items= driver.findElements(additemstocartLocator);
		for(int i=0;i<items.size();i++)
		{
			items.get(i).click();
			if(i==3)
				break;
		}
	}
	public void clickOnAddToCart()
	{
		driver.findElement(addtocartButtonLocator).click();
	}
	public void placeOrder()
	{
		driver.findElement(placeorderLocator).click();
	}
}
